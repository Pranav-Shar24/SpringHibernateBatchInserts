package com.pranav.insertOperations.Repository;


import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.pranav.insertOperations.Entity.StudentEntity;
import com.pranav.insertOperations.Utility.BatchRepository;

@Repository
public interface StudentRepo extends BatchRepository<StudentEntity, Serializable>{

}
