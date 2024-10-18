package com.example.dpr.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class MasterPayEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long prepaid;
	private Long postpaid;
	private Long pending;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPrepaid() {
		return prepaid;
	}
	public void setPrepaid(Long prepaid) {
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
		return "MasterpayEntity [id=" + id + ", prepaid=" + prepaid + ", postpaid=" + postpaid + ", pending=" + pending
				+ "]";
	}
	public MasterPayEntity(Long id, Long prepaid, Long postpaid, Long pending) {
		super();
		this.id = id;
		this.prepaid = prepaid;
		this.postpaid = postpaid;
		this.pending = pending;
	}
	public MasterPayEntity() {
		super();
		
	}
	
}
