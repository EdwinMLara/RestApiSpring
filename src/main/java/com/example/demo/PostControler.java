package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
import org.apache.logging.log4j.message.ReusableMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;


@RestController
public class PostControler {

    @Autowired
    private PostService postservice;

    @RequestMapping(value="/posts", method=RequestMethod.GET)
    public List<Post> getAllPost() {
        return postservice.getAllPost();
    }
    
    @RequestMapping(value="/posts/{id}")
    public Post getPost(@PathVariable String id){
        return postservice.getPost(id);
    }
    
    @RequestMapping(value="/posts",method=RequestMethod.POST)
    public void addPost(@RequestBody Post post){
        postservice.addPost(post);
    }
}