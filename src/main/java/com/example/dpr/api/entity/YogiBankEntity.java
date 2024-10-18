package com.example.dpr.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class YogiBankEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long sbi;
	private Long hdfc;
	private Long icic;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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
	public Long getIcic() {
		return icic;
	}
	public void setIcic(Long icic) {
		this.icic = icic;
	}
	@Override
	public String toString() {
		return "YogiBankEntity [id=" + id + ", sbi=" + sbi + ", hdfc=" + hdfc + ", icic=" + icic + "]";
	}
	public YogiBankEntity(Long id, Long sbi, Long hdfc, Long icic) {
		super();
		this.id = id;
		this.sbi = sbi;
		this.hdfc = hdfc;
		this.icic = icic;
	}
	public YogiBankEntity() {
		super();
		
	}
	
}
