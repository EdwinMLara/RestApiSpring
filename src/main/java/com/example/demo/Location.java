package com.example.demo;

public class Location {
    private String id;
    private String name;
    
    public Location(){

    }

    public Location(String id,String name){
        this.id = id;
        this.name = name;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}