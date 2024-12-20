package com.example.relationship.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.relationship.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{

}
