package com.example.BBConsumer.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import javax.persistence.Id;
import java.util.Date;


@RedisHash("employee")
@Getter
@Setter
@ToString
public class RedisEmployee {
    @Id
    String id;
    String firstName ;
    @Indexed
    String lastName ;
    Date dateOfBirth ;
    double experience ;
}
