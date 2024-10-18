package com.example.dpr.api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class SravaniBankEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Long kotak;
	private Long hdfc;
	private Long icic;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getKotak() {
		return kotak;
	}
	public void setKotak(Long kotak) {
		this.kotak = kotak;
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
		return "SravaniBankEntity [id=" + id + ", kotak=" + kotak + ", hdfc=" + hdfc + ", icic=" + icic + "]";
	}
	public SravaniBankEntity(Long id, Long kotak, Long hdfc, Long icic) {
		super();
		this.id = id;
		this.kotak = kotak;
		this.hdfc = hdfc;
		this.icic = icic;
	}
	public SravaniBankEntity() {
		super();
		
	}
	

}
