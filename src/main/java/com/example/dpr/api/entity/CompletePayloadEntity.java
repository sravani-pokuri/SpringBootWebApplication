package com.example.dpr.api.entity;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class CompletePayloadEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne(cascade = CascadeType.ALL) 
    @JoinColumn(name = "form_data_id")
    private FormDataEntity formData;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "complete_payload_id") 
    private List<YogiNeedListEntity> yogiNeedList;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "complete_payload_id") 
    private List<YogiGetListEntity> yogiGetList;
    
    private String date;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public FormDataEntity getFormData() {
		return formData;
	}

	public void setFormData(FormDataEntity formData) {
		this.formData = formData;
	}

	public List<YogiNeedListEntity> getYogiNeedList() {
		return yogiNeedList;
	}

	public void setYogiNeedList(List<YogiNeedListEntity> yogiNeedList) {
		this.yogiNeedList = yogiNeedList;
	}

	public List<YogiGetListEntity> getYogiGetList() {
		return yogiGetList;
	}

	public void setYogiGetList(List<YogiGetListEntity> yogiGetList) {
		this.yogiGetList = yogiGetList;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "CompletePayloadEntity [id=" + id + ", formData=" + formData + ", yogiNeedList=" + yogiNeedList
				+ ", yogiGetList=" + yogiGetList + ", date=" + date + "]";
	}

	public CompletePayloadEntity(Long id, FormDataEntity formData, List<YogiNeedListEntity> yogiNeedList,
			List<YogiGetListEntity> yogiGetList, String date) {
		super();
		this.id = id;
		this.formData = formData;
		this.yogiNeedList = yogiNeedList;
		this.yogiGetList = yogiGetList;
		this.date = date;
	}
    
    
	
	
	
}