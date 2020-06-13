package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface LocationRepositoy extends CrudRepository<Location,String> {

    public List<Location> findByName(String name);
    
}