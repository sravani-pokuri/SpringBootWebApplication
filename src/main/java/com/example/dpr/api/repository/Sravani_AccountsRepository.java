package com.example.dpr.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dpr.api.entity.Sravani_Accounts;

@Repository
public interface Sravani_AccountsRepository extends JpaRepository<Sravani_Accounts, Long>{

}
