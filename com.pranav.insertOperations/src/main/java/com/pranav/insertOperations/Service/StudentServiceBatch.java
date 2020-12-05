package com.pranav.insertOperations.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pranav.insertOperations.Entity.StudentEntity;
import com.pranav.insertOperations.Repository.JPABatchRepository;
import com.pranav.insertOperations.Request.StudentRequest;

@Service
public class StudentServiceBatch {

	@Value("${spring.jpa.properties.hibernate.jdbc.batch_size}")
	private int batchSize;

	@Autowired
	private JPABatchRepository sRepository;

	@Transactional
	public void batchAuthors(StudentRequest request) {

		long studentId = 55L;
		List<StudentEntity> list = request.getCourses().stream().map(ele -> new StudentEntity(studentId, ele))
				.collect(Collectors.toList());
		int size = list.size();
		int counter = 0;

		List<StudentEntity> temp = new ArrayList<>();

		for (StudentEntity studentEntity : list) {
			temp.add(studentEntity);
			if ((counter + 1) % batchSize == 0 || (counter + 1) == size) {
				sRepository.saveAll(list);
				temp.clear();
			}
			counter++;
		}
	}
}
