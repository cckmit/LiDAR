package com.lq.lidar.domain.dto;

import com.lq.lidar.domain.entity.OlPurchPaymentApproval;
import com.lq.lidar.domain.entity.OlPurchPaymentExtra;

import javax.validation.Valid;
import java.util.List;

public class OlPurchPaymentApprovalDTO {
    /**
     * 申请单
     */
    @Valid
    private OlPurchPaymentApproval olPurchPaymentApproval;
    /**
     * 采购明细
     */
    private List<OlPurchPaymentExtra> olPurchPaymentExtraList;

    public OlPurchPaymentApproval getOlPurchPaymentApproval() {
        return olPurchPaymentApproval;
    }

    public void setOlPurchPaymentApproval(OlPurchPaymentApproval olPurchPaymentApproval) {
        this.olPurchPaymentApproval = olPurchPaymentApproval;
    }

    public List<OlPurchPaymentExtra> getOlPurchPaymentExtraList() {
        return olPurchPaymentExtraList;
    }

    public void setOlPurchPaymentExtraList(List<OlPurchPaymentExtra> olPurchPaymentExtraList) {
        this.olPurchPaymentExtraList = olPurchPaymentExtraList;
    }
}
