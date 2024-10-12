package com.example.relationship.service;

import com.example.relationship.entities.Course;
import com.example.relationship.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course getCourseById(Long id) {
        Optional<Course> course = courseRepository.findById(id);
        return course.orElse(null); // Handle not found case properly
    }

    public Course updateCourse(Long id, Course course) {
        Optional<Course> existingCourse = courseRepository.findById(id);
        if (existingCourse.isPresent()) {
            course.setId(id);
            return courseRepository.save(course);
        }
        return null; // Handle not found case properly
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }
}
