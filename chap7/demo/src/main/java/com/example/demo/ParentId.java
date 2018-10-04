package com.example.demo;

import java.io.Serializable;

public class ParentId implements Serializable {

    private String id;
    private String id2;
    public ParentId(){

    }

    public ParentId(String id, String id2) {
        this.id = id;
        this.id2 = id2;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
