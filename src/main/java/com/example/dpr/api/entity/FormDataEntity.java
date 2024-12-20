package com.example.dpr.api.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.CreationTimestamp;

@Entity
public class FormDataEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "instantMudra_id")
    private InstantMudraEntity instantmudra;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "masterPay_id")
    private MasterPayEntity masterpay;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "imperia_id")
    private ImperiaEntity imperia;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "yogiBank_id")
    private YogiBankEntity yogiBank;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "sravaniBank_id")
    private SravaniBankEntity sravaniBank;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "yogiCreditCards_id")
    private YogiCreditCardsEntity yogiCreditCards;

    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdDate;

    public InstantMudraEntity getInstantmudra() {
        return instantmudra;
    }

    public void setInstantmudra(InstantMudraEntity instantmudra) {
        this.instantmudra = instantmudra;
    }

    public MasterPayEntity getMasterpay() {
        return masterpay;
    }

    public void setMasterpay(MasterPayEntity masterpay) {
        this.masterpay = masterpay;
    }

    public ImperiaEntity getImperia() {
        return imperia;
    }

    public void setImperia(ImperiaEntity imperia) {
        this.imperia = imperia;
    }

    public YogiBankEntity getYogiBank() {
        return yogiBank;
    }

    public void setYogiBank(YogiBankEntity yogiBank) {
        this.yogiBank = yogiBank;
    }

    public SravaniBankEntity getSravaniBank() {
        return sravaniBank;
    }

    public void setSravaniBank(SravaniBankEntity sravaniBank) {
        this.sravaniBank = sravaniBank;
    }

    public YogiCreditCardsEntity getYogiCreditCards() {
        return yogiCreditCards;
    }

    public void setYogiCreditCards(YogiCreditCardsEntity yogiCreditCards) {
        this.yogiCreditCards = yogiCreditCards;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    @Override
    public String toString() {
        return "FormDataEntity [instantmudra=" + instantmudra + ", masterpay=" + masterpay + ", imperia=" + imperia
                + ", yogiBank=" + yogiBank + ", sravaniBank=" + sravaniBank + ", yogiCreditCards=" + yogiCreditCards
                + ", createdDate=" + createdDate + "]";
    }

    // Constructors
    public FormDataEntity(InstantMudraEntity instantmudra, MasterPayEntity masterpay, ImperiaEntity imperia,
                          YogiBankEntity yogiBank, SravaniBankEntity sravaniBank, YogiCreditCardsEntity yogiCreditCards) {
        super();
        this.instantmudra = instantmudra;
        this.masterpay = masterpay;
        this.imperia = imperia;
        this.yogiBank = yogiBank;
        this.sravaniBank = sravaniBank;
        this.yogiCreditCards = yogiCreditCards;
    }

    public FormDataEntity() {
        super();
    }
}
