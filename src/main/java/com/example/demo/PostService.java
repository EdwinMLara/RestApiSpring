package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PostService {
    User u1 = new User("u1", "jany", "Lawrence", new Location("l1", "lagos"), "jany@gmail.com");
    User u2 = new User("u2", "jadon", "Millis", new Location("l2", "Asaba"), "jadon@gmail.com");
    Post p1 = new Post("p1", "01-jan-2020", u1, "Que chingon");
    Post p2 = new Post("p2", "02-jan-2020", u2, "Es el segundo post");

    List<Post> posts = Arrays.asList(p1,p2);
    List<Post> posts2 = new ArrayList<>(posts);

    public List<Post> getAllPost(){
        return this.posts2;
    }
    

    public Post getPost(final String id){
        final Post post = posts2.stream().filter(p -> id.equals(p.getId())).findFirst().orElse(null);
        return post;
    }
    
    public void addPost(final Post post){
        System.out.println(post.getDetails()+post.getPostdate());
        posts2.add(post);
    }

    public void updatePost(final String id, final Post post){
        for(int i=0;i<posts2.size();i++){
            final Post aux = posts2.get(i);
            if(aux.getId().equals(id)){
                posts2.set(i, post);
                break;
            }
        }
    }

    public void deletePost(final String id){
        posts2.removeIf(p->p.getId().equals(id));
    }
}