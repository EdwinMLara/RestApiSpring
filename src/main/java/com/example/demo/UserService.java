package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userrepository;
    
    public List<User> getAllUsers(){
        List<User> users = new ArrayList<>();
        userrepository.findAll().forEach(users::add);
        return users;
    }

    public Optional<User> getUser(String id){
        return userrepository.findById(id);
    }

    public void addUser(User user){
        userrepository.save(user);
    }

    public void updateUser(String id,User user){
        userrepository.save(user);
    }

    public void deleteUser(String id){
        userrepository.deleteById(id);
    }
}