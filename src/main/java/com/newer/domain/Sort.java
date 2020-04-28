package com.newer.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Sort {
    private BigDecimal sortid;

    private BigDecimal shoesid;

    private String name;

    private BigDecimal pid;

    private Date createdate;

    private Date updatetime;

    public BigDecimal getSortid() {
        return sortid;
    }

    public void setSortid(BigDecimal sortid) {
        this.sortid = sortid;
    }

    public BigDecimal getShoesid() {
        return shoesid;
    }

    public void setShoesid(BigDecimal shoesid) {
        this.shoesid = shoesid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPid() {
        return pid;
    }

    public void setPid(BigDecimal pid) {
        this.pid = pid;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}