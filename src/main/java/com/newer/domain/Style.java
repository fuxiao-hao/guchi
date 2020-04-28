package com.newer.domain;

import java.math.BigDecimal;

public class Style {
    private BigDecimal styleid;

    private BigDecimal shoShoesid;

    private String stylename;

    private String ssize;

    private String color;

    private String image;

    public BigDecimal getStyleid() {
        return styleid;
    }

    public void setStyleid(BigDecimal styleid) {
        this.styleid = styleid;
    }

    public BigDecimal getShoShoesid() {
        return shoShoesid;
    }

    public void setShoShoesid(BigDecimal shoShoesid) {
        this.shoShoesid = shoShoesid;
    }

    public String getStylename() {
        return stylename;
    }

    public void setStylename(String stylename) {
        this.stylename = stylename;
    }

    public String getSsize() {
        return ssize;
    }

    public void setSsize(String ssize) {
        this.ssize = ssize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}