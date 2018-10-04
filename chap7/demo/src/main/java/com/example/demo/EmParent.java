package com.example.demo;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class EmParent {

    @EmbeddedId
    private EmParentId parentId;

    public EmParentId getParentId() {
        return parentId;
    }

    public void setParentId(EmParentId parentId) {
        this.parentId = parentId;
    }
}
