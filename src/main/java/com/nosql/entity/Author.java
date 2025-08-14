package com.nosql.entity;

import org.springframework.data.neo4j.core.schema.*;

@Node
public class Author {
    @Id @GeneratedValue
    private Long id;
    private String name;

    // Constructors, getters, and setters
    public Author() {}

    public Author(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
