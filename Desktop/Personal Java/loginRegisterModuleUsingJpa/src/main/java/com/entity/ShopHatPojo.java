package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ShopHatPojo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String nm;
	@Column(unique = true)     //For login, mono (mobile number) should always be unique.
	long mono;
	String pass;
	String email;
	String addr;
	public ShopHatPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ShopHatPojo(int id, String nm, long mono, String pass, String email, String addr) {
		super();
		this.id = id;
		this.nm = nm;
		this.mono = mono;
		this.pass = pass;
		this.email = email;
		this.addr = addr;
	}
	public ShopHatPojo(String nm, long mono, String pass, String email, String addr) {
		super();
		this.nm = nm;
		this.mono = mono;
		this.pass = pass;
		this.email = email;
		this.addr = addr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNm() {
		return nm;
	}
	public void setNm(String nm) {
		this.nm = nm;
	}
	public long getMono() {
		return mono;
	}
	public void setMono(long mono) {
		this.mono = mono;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String add) {
		this.addr = add;
	}
	@Override
	public String toString() {
		return "ShopHatPojo [id=" + id + ", nm=" + nm + ", mono=" + mono + ", pass=" + pass + ", email=" + email + ", add="
				+ addr + "]";
	}

}
