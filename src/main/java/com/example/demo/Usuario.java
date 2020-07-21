package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Usuario extends AudiTable<String>{

    @Id
    private String id;
    private String email;
    private String name;
    private String password;
    
    @ManyToOne
    private Location location;

    public Usuario(){    
    }

    public Usuario(final String id,final String name,final Location location,final String email,final String password){
        this.id = id;
        this.name = name;
        this.location = location;
        this.email = email;
        this.password = password;
    }

    public String getId() {
        return this.id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Location getLocation() {
        return this.location;
    }

    public void setLocation(final Location location) {
        this.location = location;
    }

    public String getEmail() {
        return this.email;
    }

    public void setString(final String email) {
        this.email = email;
    }

    public void setPassword(final String password){
        this.password = password;
    }

    public String getPassword(){
        return this.password;
    }
}