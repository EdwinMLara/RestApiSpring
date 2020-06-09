package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    User u1 = new User("u1","jany","Lawrence", new Location("l1","lagos"),"jany@gmail.com");
    User u2 = new User("u2","jadon","Millis", new Location("l2","Asaba"),"jadon@gmail.com");
    List <User> users = Arrays.asList(u1,u2);
    
    public List<User> getAllUsers(){
        return users;
    }

    public User getUser(String id){
        User user = users.stream().filter(u -> id.equals(u.getId())).findFirst().orElse(null);
        return user;
    }

    public void addUser(User user){
        users.add(user);
    }
}