package com.newer.domain;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Table(name="account")
public class Account {
	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY,generator = "select account_id.nextval from dual")
       private Integer accountid;
       private String phone;
       private String status;
       private String email;
       @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
       private Date regtime;
       private String passward;
       private String photo;
       public Account() {
		// TODO Auto-generated constructor stub
	}
	public Account(Integer accountid, String phone, String status, String email, Date regtime, String passward,
			String photo) {
		super();
		this.accountid = accountid;
		this.phone = phone;
		this.status = status;
		this.email = email;
		this.regtime = regtime;
		this.passward = passward;
		this.photo = photo;
	}
	public Integer getAccountid() {
		return accountid;
	}
	public void setAccountid(Integer accountid) {
		this.accountid = accountid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getRegtime() {
		return regtime;
	}
	public void setRegtime(Date regtime) {
		this.regtime = regtime;
	}
	public String getPassward() {
		return passward;
	}
	public void setPassward(String passward) {
		this.passward = passward;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	@Override
	public String toString() {
		return "AccountMapper [accountid=" + accountid + ", phone=" + phone + ", status=" + status + ", email=" + email
				+ ", regtime=" + regtime + ", passward=" + passward + ", photo=" + photo + "]";
	}
       
       
}
