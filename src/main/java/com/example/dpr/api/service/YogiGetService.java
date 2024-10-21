package com.example.dpr.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dpr.api.entity.YogiGetListEntity;
import com.example.dpr.api.repository.YogiGetListRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class YogiGetService {
	
	@Autowired
	private YogiGetListRepository yogiGetListRepository;

	public void save(YogiGetListEntity yogiGet) {
		//if(yogiGet != null) {
		yogiGetListRepository.save(yogiGet);
	}

	public List<YogiGetListEntity> findAll() {
		
		return yogiGetListRepository.findAll();
	}

	
	public List<YogiGetListEntity> findByDate(String date) {
	    return yogiGetListRepository.findByDate(date);
	}
}
