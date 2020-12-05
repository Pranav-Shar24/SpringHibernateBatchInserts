package com.pranav.insertOperations.Repository;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.pranav.insertOperations.Entity.StudentEntity;

@Repository
public interface StudentRepository extends BatchRepository<StudentEntity, Serializable>{

}
