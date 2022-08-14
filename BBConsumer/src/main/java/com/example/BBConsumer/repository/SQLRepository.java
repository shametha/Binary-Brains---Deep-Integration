package com.example.BBConsumer.repository;

import com.example.BBConsumer.entity.SQLEmployee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SQLRepository extends CrudRepository<SQLEmployee,String> {
}
