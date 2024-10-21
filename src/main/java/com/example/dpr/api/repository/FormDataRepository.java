package com.example.dpr.api.repository;


import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.dpr.api.entity.FormDataEntity;

public interface FormDataRepository extends JpaRepository<FormDataEntity, Long>{

	List<FormDataEntity> findDataByDate(Date date);



	

}
