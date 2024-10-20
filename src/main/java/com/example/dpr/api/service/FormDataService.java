package com.example.dpr.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dpr.api.entity.FormDataEntity;
import com.example.dpr.api.repository.FormDataRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class FormDataService {
	
	@Autowired
	private FormDataRepository formDataRepository;
	
	public void save(FormDataEntity formData) {
		//if(formData != null) {
		formDataRepository.save(formData);
		}
	

	public List<FormDataEntity> findAll() {
		
		return formDataRepository.findAll();
	}

}
