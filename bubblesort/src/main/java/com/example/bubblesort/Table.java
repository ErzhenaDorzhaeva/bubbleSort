package com.example.bubblesort;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Table {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long  id;
    private String name;

    public Table() {
    }

    public Table(String name) {
        this.name = name;
    }

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
