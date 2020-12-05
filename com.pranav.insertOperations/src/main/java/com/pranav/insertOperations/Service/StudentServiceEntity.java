package com.pranav.insertOperations.Service;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pranav.insertOperations.Entity.StudentEntity;
import com.pranav.insertOperations.Request.StudentRequest;

@Service
public class StudentServiceEntity {

	@Autowired
	private EntityManager entityManager;

	@Value("${spring.jpa.properties.hibernate.jdbc.batch_size}")
	private int batchSize;

	@Transactional
	public void whenFlushingAfterBatch_ThenClearsMemory(StudentRequest request) {

		long studentId = 1L;
		List<StudentEntity> list = request.getCourses().stream().map(ele -> new StudentEntity(studentId, ele))
				.collect(Collectors.toList());

		int i = 0;
		for (StudentEntity studentEntity : list) {
			if (i > 0 && i % batchSize == 0) {
				entityManager.flush();
				entityManager.clear();
			}
			entityManager.persist(studentEntity);
		}

	}
}
