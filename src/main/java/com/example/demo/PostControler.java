package com.example.demo;

import org.springframework.web.bind.annotation.RestController;
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
        System.out.println(post.getDetails());
        postservice.addPost(post);
    }

    @RequestMapping(value="/posts",method=RequestMethod.PUT)
    public void updatePost(@RequestBody Post post,@PathVariable String id){
        postservice.updatePost(id,post);
    }

    @RequestMapping(value="/posts/{id}",method=RequestMethod.DELETE)
    public void deletePost(@PathVariable String id){
        postservice.deletePost(id);
    }
}