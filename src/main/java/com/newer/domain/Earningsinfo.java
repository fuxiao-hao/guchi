package com.newer.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Earningsinfo {
    private BigDecimal id;

    private String orderid;

    private BigDecimal purchasingprice;

    private BigDecimal sellingprice;

    private BigDecimal shippingprice;

    private Date writetime;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public BigDecimal getPurchasingprice() {
        return purchasingprice;
    }

    public void setPurchasingprice(BigDecimal purchasingprice) {
        this.purchasingprice = purchasingprice;
    }

    public BigDecimal getSellingprice() {
        return sellingprice;
    }

    public void setSellingprice(BigDecimal sellingprice) {
        this.sellingprice = sellingprice;
    }

    public BigDecimal getShippingprice() {
        return shippingprice;
    }

    public void setShippingprice(BigDecimal shippingprice) {
        this.shippingprice = shippingprice;
    }

    public Date getWritetime() {
        return writetime;
    }

    public void setWritetime(Date writetime) {
        this.writetime = writetime;
    }
}