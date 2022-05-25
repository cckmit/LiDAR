package com.lq.lidar.controller;


import com.lq.lidar.common.annotation.TaskTime;
import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.domain.dto.AssetAllowanceAndDeprecationDTO;
import com.lq.lidar.domain.entity.OlAssetAllowanceDetail;
import com.lq.lidar.domain.entity.OlAssetDepreciationDetail;
import com.lq.lidar.domain.entity.OlAssetInfoAdd;
import com.lq.lidar.domain.vo.OlAssetInfoAddVO;
import com.lq.lidar.service.IOlAssetAllowanceDetailService;
import com.lq.lidar.service.IOlAssetDepreciationDetailService;
import com.lq.lidar.service.IOlAssetInfoAddService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 租赁物前端控制器
 * </p>
 *
 * @author LQ
 * @since 2022-05-21
 */
@RestController
@RequestMapping("/asset/olAssetInfoAdd")
@CrossOrigin
public class OlAssetInfoAddController extends BaseController {

    @Resource
    IOlAssetInfoAddService assetInfoAddService;
    @Resource
    IOlAssetAllowanceDetailService assetAllowanceDetailService;
    @Resource
    IOlAssetDepreciationDetailService assetDepreciationDetailService;

    /**
     * 租赁物信息分页列表查询
     *
     * @return
     */
    @GetMapping("/list")
    @TaskTime
    public ResponseEntity list(OlAssetInfoAdd assetInfoAdd) {
        startPage();
        List<OlAssetInfoAdd> list = assetInfoAddService.lambdaQuery().like(StringUtils.isNotBlank(assetInfoAdd.getAssetNo()), OlAssetInfoAdd::getAssetNo, assetInfoAdd.getAssetNo()).list();
        return ResponseEntity.success(getDataTable(list));
    }

    @GetMapping("/getAllowanceAndDeprecationByAssetAddSeqno/{assetAddSeqno}")
    public ResponseEntity getAllowanceAndDeprecationByAssetAddSeqno(@PathVariable String assetAddSeqno) {
        List<OlAssetAllowanceDetail> assetAllowanceDetails = assetAllowanceDetailService.getOlAssetAllowanceDetailByAssetAddSeqno(assetAddSeqno);
        List<OlAssetDepreciationDetail> olAssetDepreciationDetails = assetDepreciationDetailService.getAssetDepreciationDetailByAssetAddSeqno(assetAddSeqno);
        AssetAllowanceAndDeprecationDTO assetAllowanceAndDeprecationDTO = new AssetAllowanceAndDeprecationDTO();
        assetAllowanceAndDeprecationDTO.setOlAssetAllowanceDetails(assetAllowanceDetails);
        assetAllowanceAndDeprecationDTO.setOlAssetDepreciationDetails(olAssetDepreciationDetails);
        return ResponseEntity.success(assetAllowanceAndDeprecationDTO);

    }

    @TaskTime
    @GetMapping("/getOlAssetInfoAddBySeqno/{seqno}")
    public ResponseEntity getOlAssetInfoAddBySeqno(@PathVariable String seqno) {
        OlAssetInfoAdd assetInfoAdd = assetInfoAddService.getById(seqno);
        OlAssetInfoAddVO olAssetInfoAddVO = new OlAssetInfoAddVO();
        BeanUtils.copyProperties(assetInfoAdd,olAssetInfoAddVO);
        return ResponseEntity.success(olAssetInfoAddVO);
    }

}

