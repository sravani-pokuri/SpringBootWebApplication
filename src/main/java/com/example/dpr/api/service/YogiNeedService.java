package com.example.dpr.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dpr.api.entity.YogiNeedListEntity;
import com.example.dpr.api.repository.YogiNeedListRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class YogiNeedService {
	
	@Autowired
	private YogiNeedListRepository yogiNeedListRepository;


	public void save(YogiNeedListEntity yogiNeed) {
		//if(yogiNeed != null) {
		yogiNeedListRepository.save(yogiNeed);
		}
	

	public List<YogiNeedListEntity> findAll() {
		
		return yogiNeedListRepository.findAll();
	}

}