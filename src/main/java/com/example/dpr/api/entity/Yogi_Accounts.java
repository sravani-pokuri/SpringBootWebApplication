package com.example.dpr.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "yogi_accounts")
public class Yogi_Accounts {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	//@NotNull
	private Long icic;
	//@NotNull
	private Long sbi;
	//@NotNull
	private Long hdfc;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}


	public Long getIcic() {
		return icic;
	}


	public void setIcic(Long icic) {
		this.icic = icic;
	}


	public Long getSbi() {
		return sbi;
	}


	public void setSbi(Long sbi) {
		this.sbi = sbi;
	}


	public Long getHdfc() {
		return hdfc;
	}


	public void setHdfc(Long hdfc) {
		this.hdfc = hdfc;
	}

	@Override
	public String toString() {
		return "Yogi_Accounts [id=" + id + ", icic=" + icic + ", sbi=" + sbi + ", hdfc=" + hdfc + "]";
	}


	
	
}
