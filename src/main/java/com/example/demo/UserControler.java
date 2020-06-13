package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Optional;



@RestController
public class UserControler {
    
    @Autowired
    private UserService userservice;

    @RequestMapping(value="/users", method=RequestMethod.GET)
    public List<User> getAllUsers() {
        return userservice.getAllUsers();
    }

    @RequestMapping(value="/users/{id}")
    public Optional<User> getUser(@PathVariable final String id) {
        return userservice.getUser(id);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public void addUser(@RequestBody final User user) {
        userservice.addUser(user);
    }

    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    public void updateUser(@RequestBody final User user, @PathVariable final String id) {
        userservice.updateUser(id, user);
    }

    @RequestMapping(value = "/uses/{id}", method = RequestMethod.DELETE)
    public void deleteUser(@PathVariable final String id) {
        userservice.deleteUser(id);
    }
    
    
}