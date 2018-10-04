package com.example.demo.inherit;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("M")
@Table(name = "Movie")
public class Movie extends Item {

    private String director;
    private String actor;

}
