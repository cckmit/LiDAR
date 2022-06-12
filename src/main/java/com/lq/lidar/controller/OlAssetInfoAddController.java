package com.lq.lidar.controller;


import com.lq.lidar.common.annotation.TaskTime;
import com.lq.lidar.common.core.controller.BaseController;
import com.lq.lidar.common.core.domain.ResponseEntity;
import com.lq.lidar.domain.dto.AssetAllowanceAndDeprecationDTO;
import com.lq.lidar.domain.entity.OlAssetAllowanceDetail;
import com.lq.lidar.domain.entity.OlAssetDepreciationDetail;
import com.lq.lidar.domain.entity.OlAssetInfoAdd;
import com.lq.lidar.service.IOlAssetAllowanceDetailService;
import com.lq.lidar.service.IOlAssetDepreciationDetailService;
import com.lq.lidar.service.IOlAssetInfoAddService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.Assert;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

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
        List<OlAssetInfoAdd> list = assetInfoAddService.lambdaQuery()
                .like(StringUtils.isNotBlank(assetInfoAdd.getAssetNo()), OlAssetInfoAdd::getAssetNo, assetInfoAdd.getAssetNo())
                .like(StringUtils.isNotBlank(assetInfoAdd.getAssetName()), OlAssetInfoAdd::getAssetName, assetInfoAdd.getAssetName())
                .eq(StringUtils.isNotBlank(assetInfoAdd.getCurrency()), OlAssetInfoAdd::getCurrency, assetInfoAdd.getCurrency())
                .list();
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

    /**
     * 根据主键获取租赁物信息
     *
     * @param seqno
     * @return
     */
    @TaskTime
    @GetMapping("/getOlAssetInfoAddBySeqno/{seqno}")
    public ResponseEntity getOlAssetInfoAddBySeqno(@PathVariable String seqno) {
        OlAssetInfoAdd assetInfoAdd = assetInfoAddService.getById(seqno);
        return ResponseEntity.success(assetInfoAdd);
    }

    /**
     * 保存更新租赁物
     *
     * @param olAssetInfoAddDTO
     * @return
     */
    @PostMapping("/saveOrUpdate")
    @TaskTime
    public ResponseEntity saveOrUpdate(@RequestBody @Validated OlAssetInfoAdd olAssetInfoAddDTO) {
        assetInfoAddService.checkSaveOrUpdate(olAssetInfoAddDTO);
        // 重复添加判断
        // 更新
        if (StringUtils.isNotBlank(olAssetInfoAddDTO.getSeqno())) {
            OlAssetInfoAdd assetInfoAdd = assetInfoAddService.getById(olAssetInfoAddDTO.getSeqno());
            if (!Objects.equals(assetInfoAdd.getAssetNo(), olAssetInfoAddDTO.getAssetNo())) {
                OlAssetInfoAdd olAssetInfoAdd = assetInfoAddService.getByAssetNo(olAssetInfoAddDTO.getAssetNo());
                Assert.isNull(olAssetInfoAdd, "该租赁物编号已存在，请更换租赁物编号重试！");
            }
            if (assetInfoAddService.updateById(olAssetInfoAddDTO)) {
                return ResponseEntity.success("修改成功");
            }
            return ResponseEntity.error("修改失败");
        }
        // 添加
        OlAssetInfoAdd assetInfoAdd = assetInfoAddService.getByAssetNo(olAssetInfoAddDTO.getAssetNo());
        Assert.isNull(assetInfoAdd, "该租赁物已存在，不可重复添加！");
        if (assetInfoAddService.save(olAssetInfoAddDTO)) {
            return ResponseEntity.success("新增成功");
        }
        return ResponseEntity.error("新增失败");
    }

    /**
     * 删除租赁物
     *
     * @param seqno
     * @return
     */
    @DeleteMapping("/delete/{seqno}")
    public ResponseEntity delete(@PathVariable String seqno) {
        boolean update = assetInfoAddService.removeById(seqno);
        if (update) {
            return ResponseEntity.success("删除成功");
        }
        return ResponseEntity.error("删除失败");
    }


}

