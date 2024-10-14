package com.example.dpr.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "instant_mudra")
public class InstantMudra {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Integer prepaid;
	private Long postpaid;
	private Long pending;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getPrepaid() {
		return prepaid;
	}
	public void setPrepaid(Integer prepaid) {
		this.prepaid = prepaid;
	}
	public Long getPostpaid() {
		return postpaid;
	}
	public void setPostpaid(Long postpaid) {
		this.postpaid = postpaid;
	}
	public Long getPending() {
		return pending;
	}
	public void setPending(Long pending) {
		this.pending = pending;
	}
	@Override
	public String toString() {
		return "InstantMudra [id=" + id + ", prepaid=" + prepaid + ", postpaid=" + postpaid + ", pending=" + pending
				+ "]";
	}
	
	

}
