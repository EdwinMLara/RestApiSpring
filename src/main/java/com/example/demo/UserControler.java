package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class UserControler {
    
    @Autowired
    private UserService userservice;

    @RequestMapping(value="/users", method=RequestMethod.GET)
    public List<User> getAllUsers() {
        return userservice.getAllUsers();
    }

    @RequestMapping(value="/users/{id}")
    public User getUser(@PathVariable String id){
        return userservice.getUser(id);
    }

    @RequestMapping(value="/users",method=RequestMethod.POST)
    public void addUser(@RequestBody User user){
        userservice.addUser(user);
    }

    @RequestMapping(value="/users",method=RequestMethod.PUT)
    public void updateUser(@RequestBody User user,@PathVariable String id){
        userservice.updateUser(id,user);
    }

    @RequestMapping(value="/uses/{id}", method=RequestMethod.DELETE)
    public void deleteUser(@PathVariable String id) {
        userservice.deleteUser(id);
    }
    
    
}