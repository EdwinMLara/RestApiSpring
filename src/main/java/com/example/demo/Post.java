package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
public class Post extends AudiTable<String>{

    @Id
    private String id;
    private String postdate;
    private String details;

    @ManyToOne
    private Usuario user;

    public Post(){

    }

    public Post(String id,String postdate,Usuario user,String details){
        this.id = id;
        this.postdate = postdate;
        this.user = user;
        this.details = details;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostdate(){
        return this.postdate;
    }

    public void setPostdate(String postdate){
        this.postdate = postdate;
    }

    public Usuario getUser(){
        return this.user;
    }

    public void setUser(Usuario user){
        this.user = user;
    }

    public String getDetails(){
        return this.details;
    }

    public void setDetails(String details){
        this.details = details;
    }
}