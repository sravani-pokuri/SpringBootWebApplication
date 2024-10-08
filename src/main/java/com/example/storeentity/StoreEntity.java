package com.example.storeentity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "store")
public class StoreEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String storeName;
	private String date;
	private Long cashAmount;
	private Long cardAmount;
	private Long totalRegisterAmount;
	private Long investedAmount;
	
	@Lob
	@Column(name = "investment_proofs")
	 private byte[] investmentProofs;
	
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Long getCashAmount() {
		return cashAmount;
	}
	public void setCashAmount(Long cashAmount) {
		this.cashAmount = cashAmount;
	}
	public Long getCardAmount() {
		return cardAmount;
	}
	public void setCardAmount(Long cardAmount) {
		this.cardAmount = cardAmount;
	}
	public Long getTotalRegisterAmount() {
		return totalRegisterAmount;
	}
	public void setTotalRegisterAmount(Long totalRegisterAmount) {
		this.totalRegisterAmount = totalRegisterAmount;
	}
	public Long getInvestedAmount() {
		return investedAmount;
	}
	public void setInvestedAmount(Long investedAmount) {
		this.investedAmount = investedAmount;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public byte[] getInvestmentProofs() {
		return investmentProofs;
	}
	public void setInvestmentProofs(byte[] investmentProofs) {
		this.investmentProofs = investmentProofs;
	}
	@Override
	public String toString() {
		return "StoreEntity [id=" + id + ", storeName=" + storeName + ", date=" + date + ", cashAmount=" + cashAmount
				+ ", cardAmount=" + cardAmount + ", totalRegisterAmount=" + totalRegisterAmount + ", investedAmount="
				+ investedAmount + "]";
	}
	

}
