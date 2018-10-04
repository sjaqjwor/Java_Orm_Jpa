package com.example.demo.inherit;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("A")
@Table(name = "Album")
public class Album extends Item {

    @Column(name = "arsssssstist" , nullable = false)
    private String artist;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
