package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    @Autowired
    private PostRepository postrepository;

    public List<Post> getAllPost() {
        List<Post> posts = new ArrayList<>();
        postrepository.findAll().forEach(posts::add);
        return posts;
    }

    public Optional<Post> getPost(final String id) {
        return postrepository.findById(id);
    }
    
    public void addPost(final Post post){
        postrepository.save(post);
    }

    public void updatePost(final String id, final Post post){
        postrepository.save(post);
    }

    public void deletePost(final String id){
        postrepository.deleteById(id);
    }
}