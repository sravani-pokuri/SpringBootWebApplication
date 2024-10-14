package com.example.dpr.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.dpr.api.entity.Yogi_Accounts;

@Repository
public interface Yogi_AccountsRepository extends JpaRepository<Yogi_Accounts, Long>{

}
