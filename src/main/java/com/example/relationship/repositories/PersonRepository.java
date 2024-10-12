package com.example.relationship.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.relationship.entities.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{

}
