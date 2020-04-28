package com.newer.domain;

import java.math.BigDecimal;
import java.util.Date;

public class Orders {
    private Long orderId;

	private Object orderDate;

	private String orderMode;

	private Integer customerId;

	private Short orderStatus;

	private BigDecimal orderTotal;

	private Integer salesRepId;

	private Integer promotionId;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Object getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Object orderDate) {
		this.orderDate = orderDate;
	}

	public String getOrderMode() {
		return orderMode;
	}

	public void setOrderMode(String orderMode) {
		this.orderMode = orderMode;
	}

	public Integer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}

	public Short getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Short orderStatus) {
		this.orderStatus = orderStatus;
	}

	public BigDecimal getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(BigDecimal orderTotal) {
		this.orderTotal = orderTotal;
	}

	public Integer getSalesRepId() {
		return salesRepId;
	}

	public void setSalesRepId(Integer salesRepId) {
		this.salesRepId = salesRepId;
	}

	public Integer getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(Integer promotionId) {
		this.promotionId = promotionId;
	}

	private String orderid;

    private BigDecimal accountid;

    private String shipid;

    private Date ordertime;

    private BigDecimal orderprice;

    private String orderstatus;

    private String paymentway;

    private String payaccount;

    private Date paytime;

    private Date deliverytime;

    private String deliveryperson;

    private Date receiptconfirmationtime;

    private String receiptaddress;

    private String consignee;

    private String paystatus;

    private Date settlementdate;

    private String trackingnumber;

    public String getOrderid() {
        return orderid;
    }

    public void setOrderid(String orderid) {
        this.orderid = orderid;
    }

    public BigDecimal getAccountid() {
        return accountid;
    }

    public void setAccountid(BigDecimal accountid) {
        this.accountid = accountid;
    }

    public String getShipid() {
        return shipid;
    }

    public void setShipid(String shipid) {
        this.shipid = shipid;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public BigDecimal getOrderprice() {
        return orderprice;
    }

    public void setOrderprice(BigDecimal orderprice) {
        this.orderprice = orderprice;
    }

    public String getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(String orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getPaymentway() {
        return paymentway;
    }

    public void setPaymentway(String paymentway) {
        this.paymentway = paymentway;
    }

    public String getPayaccount() {
        return payaccount;
    }

    public void setPayaccount(String payaccount) {
        this.payaccount = payaccount;
    }

    public Date getPaytime() {
        return paytime;
    }

    public void setPaytime(Date paytime) {
        this.paytime = paytime;
    }

    public Date getDeliverytime() {
        return deliverytime;
    }

    public void setDeliverytime(Date deliverytime) {
        this.deliverytime = deliverytime;
    }

    public String getDeliveryperson() {
        return deliveryperson;
    }

    public void setDeliveryperson(String deliveryperson) {
        this.deliveryperson = deliveryperson;
    }

    public Date getReceiptconfirmationtime() {
        return receiptconfirmationtime;
    }

    public void setReceiptconfirmationtime(Date receiptconfirmationtime) {
        this.receiptconfirmationtime = receiptconfirmationtime;
    }

    public String getReceiptaddress() {
        return receiptaddress;
    }

    public void setReceiptaddress(String receiptaddress) {
        this.receiptaddress = receiptaddress;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public String getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(String paystatus) {
        this.paystatus = paystatus;
    }

    public Date getSettlementdate() {
        return settlementdate;
    }

    public void setSettlementdate(Date settlementdate) {
        this.settlementdate = settlementdate;
    }

    public String getTrackingnumber() {
        return trackingnumber;
    }

    public void setTrackingnumber(String trackingnumber) {
        this.trackingnumber = trackingnumber;
    }
}