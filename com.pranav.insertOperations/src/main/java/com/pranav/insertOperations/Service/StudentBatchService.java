package com.pranav.insertOperations.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pranav.insertOperations.Entity.StudentEntity;
import com.pranav.insertOperations.Repository.StudentRepository;
import com.pranav.insertOperations.Request.StudentRequest;

@Service
public class StudentBatchService {

	/*
	 * @Value("${spring.jpa.properties.hibernate.jdbc.batch_size}") private int
	 * batchSize;
	 */
	@Autowired
	private StudentRepository stuRepository;

	public void batchStudents(StudentRequest request) {
		

		long studentId = 2L;
		List<StudentEntity> list = request.getCourses().stream().map(ele -> new StudentEntity(studentId, ele))
				.collect(Collectors.toList());
		
		stuRepository.saveInBatch(list);
		
		}

	}     
