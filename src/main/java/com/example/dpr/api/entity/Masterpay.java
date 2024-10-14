package com.example.dpr.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "master_pay")
public class Masterpay {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Integer wallet;
	private Long pending;
	private Integer distributer;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getWallet() {
		return wallet;
	}
	public void setWallet(Integer wallet) {
		this.wallet = wallet;
	}
	public Long getPending() {
		return pending;
	}
	public void setPending(Long pending) {
		this.pending = pending;
	}
	public Integer getDistributer() {
		return distributer;
	}
	public void setDistributer(Integer distributer) {
		this.distributer = distributer;
	}
	@Override
	public String toString() {
		return "Masterpay [id=" + id + ", wallet=" + wallet + ", pending=" + pending + ", distributer=" + distributer
				+ "]";
	}
	
	
}
