package com.newer.domain;

import java.math.BigDecimal;

public class Inventory {
    private BigDecimal inventoryid;

    private BigDecimal styleid;

    private BigDecimal inventorynumberr;

    private BigDecimal actuallockinv;

    private BigDecimal predict;

    private BigDecimal purchasenumber;

    public BigDecimal getInventoryid() {
        return inventoryid;
    }

    public void setInventoryid(BigDecimal inventoryid) {
        this.inventoryid = inventoryid;
    }

    public BigDecimal getStyleid() {
        return styleid;
    }

    public void setStyleid(BigDecimal styleid) {
        this.styleid = styleid;
    }

    public BigDecimal getInventorynumberr() {
        return inventorynumberr;
    }

    public void setInventorynumberr(BigDecimal inventorynumberr) {
        this.inventorynumberr = inventorynumberr;
    }

    public BigDecimal getActuallockinv() {
        return actuallockinv;
    }

    public void setActuallockinv(BigDecimal actuallockinv) {
        this.actuallockinv = actuallockinv;
    }

    public BigDecimal getPredict() {
        return predict;
    }

    public void setPredict(BigDecimal predict) {
        this.predict = predict;
    }

    public BigDecimal getPurchasenumber() {
        return purchasenumber;
    }

    public void setPurchasenumber(BigDecimal purchasenumber) {
        this.purchasenumber = purchasenumber;
    }
}