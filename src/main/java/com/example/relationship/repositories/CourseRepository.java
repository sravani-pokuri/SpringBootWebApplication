package com.example.relationship.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.relationship.entities.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{

}
