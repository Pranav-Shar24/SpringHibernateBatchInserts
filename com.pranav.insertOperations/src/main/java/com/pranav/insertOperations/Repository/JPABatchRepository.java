package com.pranav.insertOperations.Repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pranav.insertOperations.Entity.StudentEntity;

@Repository
public interface JPABatchRepository extends JpaRepository<StudentEntity, Serializable>{

}
