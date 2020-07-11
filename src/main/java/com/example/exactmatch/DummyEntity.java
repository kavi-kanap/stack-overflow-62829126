package com.example.exactmatch;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity

public class DummyEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ElementCollection
    private List<String> items;

    public DummyEntity() {
    }

    public DummyEntity(String name, List<String> items) {
        this.name = name;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }
}
