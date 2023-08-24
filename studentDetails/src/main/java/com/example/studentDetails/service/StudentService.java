package com.example.studentDetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentDetails.entity.Student;
import com.example.studentDetails.repository.StudentRepository;

@Service
public class StudentService {
	
		@Autowired
		StudentRepository studentRepo;
		public Student update(Student student)
		{
			return studentRepo.save(student);
		}
		public void delete(int id)
		{
			studentRepo.deleteById(id);
		}
		public void deleteInfo(Student student)
		{
			studentRepo.delete(student);
		}
		public Student create(Student student) {
			return studentRepo.save(student);
		}

	}

