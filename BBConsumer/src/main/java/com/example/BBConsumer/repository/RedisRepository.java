package com.example.BBConsumer.repository;

import com.example.BBConsumer.entity.RedisEmployee;
import com.example.BBConsumer.entity.SQLEmployee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedisRepository extends CrudRepository<RedisEmployee,String> {
}
