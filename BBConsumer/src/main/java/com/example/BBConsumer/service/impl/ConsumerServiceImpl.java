package com.example.BBConsumer.service.impl;

import com.example.BBConsumer.entity.MongoEmployee;
import com.example.BBConsumer.entity.RedisEmployee;
import com.example.BBConsumer.entity.SQLEmployee;
import com.example.BBConsumer.repository.MongoDBRepository;
import com.example.BBConsumer.repository.RedisRepository;
import com.example.BBConsumer.repository.SQLRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;


@Service
public class ConsumerServiceImpl {

    @Autowired
    SQLRepository sqlRepository;

    @Autowired
    MongoDBRepository mongoRepository;

    @Autowired
    RedisRepository redisRepository;

    @KafkaListener(topics = "mytopic1",groupId = "mygroup")
    public void saveEmployeeSQL(String dataValue) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            SQLEmployee sqlEmployee = objectMapper.readValue(dataValue,SQLEmployee.class);
            System.out.println(sqlEmployee);
            sqlRepository.save(sqlEmployee);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @KafkaListener(topics = "mytopic2",groupId = "mygroup")
    public void saveEmployeeMongo(String dataValue) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            MongoEmployee mongoEmployee = objectMapper.readValue(dataValue,MongoEmployee.class);
            System.out.println(mongoEmployee);
            mongoRepository.save(mongoEmployee);
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    @KafkaListener(topics = "mytopic3",groupId = "mygroup")
    public void saveEmployeeRedis(String dataValue) {
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            RedisEmployee redisEmployee = objectMapper.readValue(dataValue,RedisEmployee.class);
            System.out.println(redisEmployee);
            redisRepository.save(redisEmployee);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
