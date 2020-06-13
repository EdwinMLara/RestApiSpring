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
        final List<User> users = new ArrayList<>();
        userrepository.findAll().forEach(users::add);
        return users;
    }

    public List<User> getUserByLocations(String locationId){
        final List<User> users = new ArrayList<>();
        userrepository.findByLocationId(locationId).forEach(users::add);
        return users;
    }

    public Optional<User> getUser(final String id) {
        return userrepository.findById(id);
    }

    public void addUser(final User user) {
        userrepository.save(user);
    }

    public void updateUser(final String id, final User user) {
        userrepository.save(user);
    }

    public void deleteUser(final String id) {
        userrepository.deleteById(id);
    }
}