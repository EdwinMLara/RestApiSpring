package com.example.demo;

public class Post {
    private String id;
    private String postdate;
    private User user;
    private String details;

    public Post(){

    }

    public Post(String id,String postdate,User user,String details){
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

    public User getUser(){
        return this.user;
    }

    public void setUser(User user){
        this.user = user;
    }

    public String getDetails(){
        return this.details;
    }

    public void setDetails(String details){
        this.details = details;
    }
}