package com.newer.domain;

import java.math.BigDecimal;

public class Address {
    private BigDecimal addressid;

    private BigDecimal accountid;

    private String consigneename;

    private String area;

    private String street;

    private String phone;

    private String isdefaultaddress;

    public BigDecimal getAddressid() {
        return addressid;
    }

    public void setAddressid(BigDecimal addressid) {
        this.addressid = addressid;
    }

    public BigDecimal getAccountid() {
        return accountid;
    }

    public void setAccountid(BigDecimal accountid) {
        this.accountid = accountid;
    }

    public String getConsigneename() {
        return consigneename;
    }

    public void setConsigneename(String consigneename) {
        this.consigneename = consigneename;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIsdefaultaddress() {
        return isdefaultaddress;
    }

    public void setIsdefaultaddress(String isdefaultaddress) {
        this.isdefaultaddress = isdefaultaddress;
    }
}