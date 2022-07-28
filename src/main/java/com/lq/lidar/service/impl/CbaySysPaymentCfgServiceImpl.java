package com.lq.lidar.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.lq.lidar.common.enums.OlStatusCode;
import com.lq.lidar.common.exception.ServiceException;
import com.lq.lidar.common.utils.DictConvert;
import com.lq.lidar.domain.entity.CbayBpBizPtnrBase;
import com.lq.lidar.domain.entity.CbaySysOffice;
import com.lq.lidar.domain.entity.CbaySysPaymentCfg;
import com.lq.lidar.mapper.CbayBpBizPtnrBaseMapper;
import com.lq.lidar.mapper.CbaySysOfficeMapper;
import com.lq.lidar.mapper.CbaySysPaymentCfgMapper;
import com.lq.lidar.service.ICbaySysPaymentCfgService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static com.lq.lidar.common.constant.OlStatusCodeConstant.*;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author LQ
 * @since 2022-06-21
 */
@Service
public class CbaySysPaymentCfgServiceImpl extends ServiceImpl<CbaySysPaymentCfgMapper, CbaySysPaymentCfg> implements ICbaySysPaymentCfgService {

    @Resource
    CbayBpBizPtnrBaseMapper cbayBpBizPtnrBaseMapper;

    @Resource
    CbaySysOfficeMapper sysOfficeMapper;
    @Resource
    DictConvert dictConvert;

    @Override
    public List<Map<String, String>> findAllRecvAccounts() {
        List<CbaySysPaymentCfg> list = this.list();
        List<Map<String, String>> accountNumberList = Lists.newArrayListWithCapacity(list.size());
        for (CbaySysPaymentCfg sysPaymentCfg : list) {
            sysPaymentCfg.setCrcyCd(dictConvert.DictValueToLabel(sysPaymentCfg.getCrcyCd()));
            CbayBpBizPtnrBase cbayBpBizPtnrBase = cbayBpBizPtnrBaseMapper.selectById(sysPaymentCfg.getBankId());
            String recvBankCde = null;
            if (cbayBpBizPtnrBase != null) {
                recvBankCde = cbayBpBizPtnrBase.getBpNm();
            }
            Map<String, String> map = Maps.newHashMapWithExpectedSize(2);
            StringBuilder label = new StringBuilder(sysPaymentCfg.getAccNbr() + "-" + sysPaymentCfg.getAccountNm());
            if (recvBankCde == null && sysPaymentCfg.getAlias() == null) {
                map.put("label", label
                        .append("-")
                        .append(sysPaymentCfg.getCrcyCd())
                        .toString());

            } else if (recvBankCde != null && sysPaymentCfg.getAlias() == null) {
                map.put("label", label
                        .append("-")
                        .append(recvBankCde)
                        .append("-")
                        .append(sysPaymentCfg.getCrcyCd())
                        .toString()
                );

            } else if (recvBankCde == null && sysPaymentCfg.getAlias() != null) {
                map.put("label", label
                        .append("-")
                        .append(sysPaymentCfg.getCrcyCd())
                        .append("-")
                        .append(sysPaymentCfg.getAlias())
                        .toString()
                );

            } else if (recvBankCde != null && sysPaymentCfg.getAlias() != null) {
                map.put("label", label
                        .append("-")
                        .append(recvBankCde)
                        .append(sysPaymentCfg.getCrcyCd())
                        .append("-")
                        .append(sysPaymentCfg.getAlias())
                        .toString()

                );

            }
            map.put("value", sysPaymentCfg.getAccNbr());

            accountNumberList.add(map);
        }
        return accountNumberList;
    }

    @Override
    public void saveOrUpdateSysPaymentCfg(CbaySysPaymentCfg cbaySysPaymentCfg) {
        String accNbr = cbaySysPaymentCfg.getAccNbr();
        Optional<CbaySysPaymentCfg> optionalCbaySysPaymentCfg = Optional.ofNullable(this.lambdaQuery().eq(CbaySysPaymentCfg::getAccNbr, accNbr).one());
        cbaySysPaymentCfg.setSapAccountNbr(convertSapAccountNbr(cbaySysPaymentCfg.getCrcyCd()));
        CbaySysOffice sysOffice = sysOfficeMapper.selectById(cbaySysPaymentCfg.getRefOfcId());
        cbaySysPaymentCfg.setAccountNm(sysOffice.getOfcNm());
        cbaySysPaymentCfg.setCityCd(sysOffice.getCityCd());
        cbaySysPaymentCfg.setStateCd(sysOffice.getStateCd());
        cbaySysPaymentCfg.setBpId(cbaySysPaymentCfg.getRefOfcId());

        optionalCbaySysPaymentCfg.ifPresentOrElse(o -> {
            if (StringUtils.isNotBlank(cbaySysPaymentCfg.getCollAcctCd())) {
                CbaySysPaymentCfg paymentCfg = this.getById(cbaySysPaymentCfg.getCollAcctCd());
                if (accNbr.equals(paymentCfg.getAccNbr())) {
                    this.updateById(cbaySysPaymentCfg);
                } else {
                    throw new ServiceException("填写账号已经存在,请重新填写");
                }
            } else {
                throw new ServiceException("填写账号已经存在,请重新填写");
            }
        }, () -> {
            cbaySysPaymentCfg.setSysInd("0");
            cbaySysPaymentCfg.setValidInd("1");
            cbaySysPaymentCfg.setAccountTypeCd("004");
            this.save(cbaySysPaymentCfg);
        });

    }


    /**
     * 设置科目编码，用户生成会计分录
     * @param tCrcyCd
     * @return
     */
    String convertSapAccountNbr(String tCrcyCd) {
        return switch (tCrcyCd) {
            case BUSI_CURRENCY_CNY -> OlStatusCode.SAP_ACCOUNT_NBR_1002_01.getCode();
            case BUSI_CURRENCY_USD -> OlStatusCode.SAP_ACCOUNT_NBR_1002_02.getCode();
            case BUSI_CURRENCY_NOK -> OlStatusCode.SAP_ACCOUNT_NBR_1002_03.getCode();
            case BUSI_CURRENCY_HKD -> OlStatusCode.SAP_ACCOUNT_NBR_1002_04.getCode();
            case BUSI_CURRENCY_SGD -> OlStatusCode.SAP_ACCOUNT_NBR_1002_05.getCode();
            default -> "";
        };
    }

}
