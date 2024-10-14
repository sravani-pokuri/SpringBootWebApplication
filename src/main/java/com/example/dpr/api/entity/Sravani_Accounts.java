package com.example.dpr.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "sravani_accounts")
public class Sravani_Accounts {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long hdfc;
	private Long kotak;
	private Long standard_chartered;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getHdfc() {
		return hdfc;
	}
	public void setHdfc(Long hdfc) {
		this.hdfc = hdfc;
	}
	public Long getKotak() {
		return kotak;
	}
	public void setKotak(Long kotak) {
		this.kotak = kotak;
	}
	public Long getStandard_chartered() {
		return standard_chartered;
	}
	public void setStandard_chartered(Long standard_chartered) {
		this.standard_chartered = standard_chartered;
	}
	@Override
	public String toString() {
		return "Sravani_Accounts [id=" + id + ", hdfc=" + hdfc + ", kotak=" + kotak + ", standard_chartered="
				+ standard_chartered + "]";
	}
	
	
}
