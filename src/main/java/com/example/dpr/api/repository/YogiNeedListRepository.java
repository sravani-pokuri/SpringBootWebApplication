package com.example.dpr.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dpr.api.entity.YogiNeedListEntity;

@Repository
public interface YogiNeedListRepository extends JpaRepository<YogiNeedListEntity, Long>{

	List<YogiNeedListEntity> findByDate(String date);

}

