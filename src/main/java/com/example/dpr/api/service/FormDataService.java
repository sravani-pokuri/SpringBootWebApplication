package com.example.dpr.api.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.example.dpr.api.entity.FormDataEntity;
import com.example.dpr.api.repository.FormDataRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class FormDataService {
	
	private static final Logger logger = LoggerFactory.getLogger(FormDataService.class); 
	
	@Autowired
	private FormDataRepository formDataRepository;
	
	public void save(FormDataEntity formData) {
		logger.info("Saving user : {}");
		
		formDataRepository.save(formData);
		}
	

//	public List<FormDataEntity> findAll() {
//		
//		return formDataRepository.findAll();
//	}


	//method to get paginated stores
	public Page<FormDataEntity> findAll(Pageable pageable) {
		logger.debug("Fetching all users");
		return formDataRepository.findAll(pageable);
	}
	
	
	

}
