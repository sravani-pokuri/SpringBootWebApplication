package com.example.dpr.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dpr.api.entity.MasterPayEntity;

@Repository
public interface MasterPayRepository extends JpaRepository<MasterPayEntity, Long>{

}
