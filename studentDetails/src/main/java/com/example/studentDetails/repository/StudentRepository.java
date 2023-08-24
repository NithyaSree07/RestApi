package com.example.studentDetails.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.studentDetails.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
