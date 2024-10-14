package com.example.dpr.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dpr.api.entity.InstantMudra;

@Repository
public interface InstantMudraRepository extends JpaRepository<InstantMudra, Long>{

}
