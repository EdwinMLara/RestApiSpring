package com.example.security;

import com.example.demo.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@Configuration

public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    public UsuarioService userservice;

    @Autowired
    private BCryptPasswordEncoder bcryp;

    @Bean
    public BCryptPasswordEncoder PasswordEncoder(){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        return bCryptPasswordEncoder;
    }

    @Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
          auth.userDetailsService(userservice).passwordEncoder(bcryp); 
    }

     @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
        .anyRequest()
        .authenticated()
        .and()
        .httpBasic();
    }

    /*@Bean
    @Override
    public UserDetailsService userDetailsService() {
        final UserDetails user = User.withDefaultPasswordEncoder()
        .username("Edwin")
        .password("123")
        .roles("USER")
        .build();
         
        return new InMemoryUserDetailsManager(user);
    }*/
}