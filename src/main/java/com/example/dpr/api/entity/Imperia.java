package com.example.dpr.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "imperia")
public class Imperia {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Double wallet;
	private Integer pending;
	private Integer distributer;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getWallet() {
		return wallet;
	}
	public void setWallet(Double wallet) {
		this.wallet = wallet;
	}
	public Integer getPending() {
		return pending;
	}
	public void setPending(Integer pending) {
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
		return "Imperia [id=" + id + ", wallet=" + wallet + ", pending=" + pending + ", distributer=" + distributer
				+ "]";
	}

}
