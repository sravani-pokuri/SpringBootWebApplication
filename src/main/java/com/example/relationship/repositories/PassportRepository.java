package com.example.relationship.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.relationship.entities.Passport;

@Repository
public interface PassportRepository extends JpaRepository<Passport, Long>{

}
