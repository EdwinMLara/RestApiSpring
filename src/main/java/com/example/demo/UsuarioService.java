package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements UserDetailsService {

    @Autowired
    private UsuarioRepository userrepository;
    
    public List<Usuario> getAllUsers(){
        final List<Usuario> users = new ArrayList<>();
        userrepository.findAll().forEach(users::add);
        return users;
    }

    public List<Usuario> getUserByLocations(String locationId){
        final List<Usuario> users = new ArrayList<>();
        userrepository.findByLocationId(locationId).forEach(users::add);
        return users;
    }

    public Optional<Usuario> getUser(final String id) {
        return userrepository.findById(id);
    }

    public void addUser(final Usuario user) {
        userrepository.save(user);
    }

    public void updateUser(final String id, final Usuario user) {
        userrepository.save(user);
    }

    public void deleteUser(final String id) {
        userrepository.deleteById(id);
    }

    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
        Usuario usuario = userrepository.findByName(username); 

        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority("ADMIN"));
        UserDetails userDetails = new User(usuario.getName(),usuario.getPassword(),roles);
        return userDetails;
    }
}