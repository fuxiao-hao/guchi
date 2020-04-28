package com.newer.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Customerloginlog {
    private BigDecimal loginid;

    private BigDecimal customerid;

    private Date logintime;

    private BigDecimal logintype;

    public BigDecimal getLoginid() {
        return loginid;
    }

    public void setLoginid(BigDecimal loginid) {
        this.loginid = loginid;
    }

    public BigDecimal getCustomerid() {
        return customerid;
    }

    public void setCustomerid(BigDecimal customerid) {
        this.customerid = customerid;
    }

    public Date getLogintime() {
        return logintime;
    }

    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    public BigDecimal getLogintype() {
        return logintype;
    }

    public void setLogintype(BigDecimal logintype) {
        this.logintype = logintype;
    }
}