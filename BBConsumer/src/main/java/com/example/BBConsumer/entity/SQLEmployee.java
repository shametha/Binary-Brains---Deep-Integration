package com.example.BBConsumer.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table(name = "BBEmployee")
@Getter
@Setter
@ToString
public class SQLEmployee {
    @Id
    @GeneratedValue
    private Integer id;
    String firstName ;
    String lastName ;
    Date dateOfBirth ;
    double experience ;
}
