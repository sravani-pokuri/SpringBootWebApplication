package com.example.storerepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.storeentity.StoreEntity;

@Repository
public interface StoreRepository extends JpaRepository<StoreEntity, Long>{

}
