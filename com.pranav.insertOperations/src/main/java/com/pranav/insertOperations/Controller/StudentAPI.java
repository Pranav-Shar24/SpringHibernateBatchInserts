package com.pranav.insertOperations.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import com.pranav.insertOperations.Request.StudentRequest;
import com.pranav.insertOperations.Service.StudentBatchService;
import com.pranav.insertOperations.Service.StudentService;
import com.pranav.insertOperations.Service.StudentServiceBatch;
import com.pranav.insertOperations.Service.StudentServiceEntity;

@RestController
@RequestMapping("/student")
public class StudentAPI {

	@Autowired
	private StudentService service;
	
	@Autowired
	private StudentServiceEntity entityService;
	
	@Autowired
	private StudentBatchService batchService;
	
	@Autowired
	private StudentServiceBatch sBatch;
	
	
	/*
	 * @Value("${spring.jpa.properties.hibernate.jdbc.batch_size}") int batchsize;
	 */

	@PostMapping
	public void createStudent(@RequestPart StudentRequest request) {
		//service.batchAuthors(request);
		//entityService.whenFlushingAfterBatch_ThenClearsMemory(request);
		//batchService.batchStudents(request);
		sBatch.batchAuthors(request);
		
	}

}