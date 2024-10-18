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
	@ManyToOne(cascade = CascadeType.ALL) // Ensure that FormDataEntity is an @Entity
    @JoinColumn(name = "form_data_id") // Foreign key column in the CompletePayloadEntity table
    private FormDataEntity formData;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "complete_payload_id") // Foreign key in the YogiNeedListEntity table
    private List<YogiNeedListEntity> yogiNeedList;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "complete_payload_id") // Foreign key in the YogiGetListEntity table
    private List<YogiGetListEntity> yogiGetList;
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
	@Override
	public String toString() {
		return "CompletePayloadEntity [formData=" + formData + ", yogiNeedList=" + yogiNeedList + ", yogiGetList="
				+ yogiGetList + "]";
	}
	public CompletePayloadEntity(FormDataEntity formData, List<YogiNeedListEntity> yogiNeedList,
			List<YogiGetListEntity> yogiGetList) {
		super();
		this.formData = formData;
		this.yogiNeedList = yogiNeedList;
		this.yogiGetList = yogiGetList;
	}
	public CompletePayloadEntity() {
		super();
		
	}
	
	
}