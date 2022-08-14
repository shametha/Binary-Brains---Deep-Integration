package com.example.BBConsumer.repository;

import com.example.BBConsumer.entity.MongoEmployee;
import org.springframework.stereotype.Repository;

@Repository
public interface MongoDBRepository extends org.springframework.data.mongodb.repository.MongoRepository<MongoEmployee,String> {
}
