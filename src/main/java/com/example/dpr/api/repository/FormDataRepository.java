package com.example.dpr.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.dpr.api.entity.FormDataEntity;

@Repository
public interface FormDataRepository extends JpaRepository<FormDataEntity, Long>{

}
