package com.pranav.insertOperations.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pranav.insertOperations.Entity.StudentEntity;
import com.pranav.insertOperations.Repository.StudentRepo;
import com.pranav.insertOperations.Request.StudentRequest;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repository;
	
	public void batchAuthors(StudentRequest request) {
		
		long studentId = 23L;
		List<StudentEntity> list = request.getCourses().stream().map(ele -> new StudentEntity(studentId, ele))
				.collect(Collectors.toList());

		repository.saveInBatch(list);
	}
}