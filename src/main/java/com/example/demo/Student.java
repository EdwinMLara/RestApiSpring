package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private String id;
    private String name;
    private String departament;

    public Student(){
    }

    public Student(String id, String name, String departament){
        super();
        this.id = id;
        this.name = name;
        this.departament = departament;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setDepartament(String departament){
        this.departament = departament;
    }

    public String getDepartament(){
        return this.departament;
    }
}