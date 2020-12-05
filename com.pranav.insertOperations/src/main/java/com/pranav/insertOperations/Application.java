package com.pranav.insertOperations;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.pranav.insertOperations.Service.StudentBatchService;
import com.pranav.insertOperations.Service.StudentService;
import com.pranav.insertOperations.Utility.BatchRepositoryImpl;

@SpringBootApplication
@EnableJpaRepositories(repositoryBaseClass = BatchRepositoryImpl.class)
@ComponentScan
public class Application {
	
	private final StudentService studentService;
	private final StudentBatchService studentBatchService;

	

	public Application(StudentService studentService, StudentBatchService studentBatchService) {
		this.studentService = studentService;
		this.studentBatchService = studentBatchService;
	}



	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	/*
	 * @Bean public ApplicationRunner init() { return args -> {
	 * studentService.batchAuthors(); }; }
	 */

}
