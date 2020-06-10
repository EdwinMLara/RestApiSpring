package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PostService {
    User u1 = new User("u1","jany","Lawrence", new Location("l1","lagos"),"jany@gmail.com");
    User u2 = new User("u2","jadon","Millis", new Location("l2","Asaba"),"jadon@gmail.com");
    Post p1 = new Post("p1","01-jan-2020",u1,"Que chingon");
    Post p2 = new Post("p2","02-jan-2020",u2,"Es el segundo post");

    List<Post> posts = Arrays.asList(p1,p2);
    public List<Post> getAllPost(){
        return this.posts;
    }
    

    public Post getPost(String id){
        Post post = posts.stream().filter(p -> id.equals(p.getId())).findFirst().orElse(null);
        return post;
    }
    
    public void addPost(Post post){
        posts.add(post);
    }

    public void updatePost(String id, Post post){
        for(int i=0;i<posts.size();i++){
            Post aux = posts.get(i);
            if(aux.getId().equals(id)){
                posts.set(i, post);
                break;
            }
        }
    }

    public void deletePost(String id){
        posts.removeIf(p->p.getId().equals(id));
    }
}