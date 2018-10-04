package com.example.demo.inherit;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class MappedExample {

    @Id @GeneratedValue
    private Long id;
    private String name;
}
