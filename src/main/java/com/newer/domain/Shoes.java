package com.newer.domain;

import java.math.BigDecimal;

public class Shoes {
    private BigDecimal shoesid;

    private String shoesname;

    private BigDecimal price;

    private String introduce;

    private String detail;

    private String status;

    private String image;

    private BigDecimal purchasingprice;

    public BigDecimal getShoesid() {
        return shoesid;
    }

    public void setShoesid(BigDecimal shoesid) {
        this.shoesid = shoesid;
    }

    public String getShoesname() {
        return shoesname;
    }

    public void setShoesname(String shoesname) {
        this.shoesname = shoesname;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public BigDecimal getPurchasingprice() {
        return purchasingprice;
    }

    public void setPurchasingprice(BigDecimal purchasingprice) {
        this.purchasingprice = purchasingprice;
    }
}