package com.example.dpr.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class YogiCreditCardsEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long icic;
	private Long hdfc;
	private Long sbi;
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
	public Long getHdfc() {
		return hdfc;
	}
	public void setHdfc(Long hdfc) {
		this.hdfc = hdfc;
	}
	public Long getSbi() {
		return sbi;
	}
	public void setSbi(Long sbi) {
		this.sbi = sbi;
	}
	@Override
	public String toString() {
		return "YogiCreditCardsEntity [id=" + id + ", icic=" + icic + ", hdfc=" + hdfc + ", sbi=" + sbi + "]";
	}
	public YogiCreditCardsEntity(Long id, Long icic, Long hdfc, Long sbi) {
		super();
		this.id = id;
		this.icic = icic;
		this.hdfc = hdfc;
		this.sbi = sbi;
	}
	public YogiCreditCardsEntity() {
		super();
		
	}
	
	
}
