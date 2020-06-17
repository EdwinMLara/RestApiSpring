package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class User extends AudiTable<String>{

    @Id
    private String id;
    private String firstname;
    private String lastname;
    private String email;
    
    @ManyToOne
    private Location location;

    public User(){    
    }

    public User(String id,String firstname, String lastname,Location location,String email){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.location = location;
        this.email = email;
    }

    public String getId(){
        return this.id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getFirtname(){
        return this.firstname;
    }

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

    public String getLastname(){
        return this.lastname;
    }

    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public Location getLocation(){
        return this.location;
    }

    public void setLocation(Location location){
        this.location = location;
    }

    public String getEmail(){
        return this.email;
    }

    public void setString(String email){
        this.email = email;
    }
}