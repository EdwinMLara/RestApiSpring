package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface UsuarioRepository extends CrudRepository<Usuario,String> {
    public List<Usuario> findByLocationId(String locationId);
    Usuario findByName(String name);
    
}