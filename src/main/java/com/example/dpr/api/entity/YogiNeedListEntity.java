package com.example.dpr.api.entity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class YogiNeedListEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;      
    private String name;  
    private Long amount;  

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "YogiNeedListEntity [id=" + id + ", name=" + name + ", amount=" + amount + "]";
    }

   
    public YogiNeedListEntity(Long id, String name, Long amount) {
        super();
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

 
    public YogiNeedListEntity() {
        super();
    }
}
