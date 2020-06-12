package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface LocationRepositoy extends CrudRepository<Location,String> {
    
}