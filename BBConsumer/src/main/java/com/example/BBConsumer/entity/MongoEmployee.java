package com.example.BBConsumer.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;


import javax.persistence.Id;
import java.util.Date;


@Document
@Getter
@Setter
@ToString
public class MongoEmployee {
    @Id
    String firstName ;
    String lastName ;
    Date dateOfBirth ;
    double experience ;
}
