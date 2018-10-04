package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EmParentId implements Serializable {

    @Column(name = "pid1")
    private String id;

    @Column(name = "pid2")
    private String id2;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmParentId that = (EmParentId) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(id2, that.id2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, id2);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId2() {
        return id2;
    }

    public void setId2(String id2) {
        this.id2 = id2;
    }

    public EmParentId(String id, String id2) {
        this.id = id;
        this.id2 = id2;
    }
    public EmParentId(){

    }
}
