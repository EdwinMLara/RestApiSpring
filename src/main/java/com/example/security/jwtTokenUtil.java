package com.example.security;

import java.io.Serializable;
import org.springframework.stereotype.Component;

@Component
public class jwtTokenUtil implements Serializable {
    
	private static final long serialVersionUID = -2550185165626007488L;
    public static final long JWT_TOKEN_VALIDITY =  5 * 60 * 60; 

    //private String secret= "javaino";
    
    /*public String getUserNameFromToken(String token){
        return getClaimFromToken(token, Claims::getSubject)
    }

    
    public <T> T getClaimFromToken(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = getAllClaimsFromToken(token);
        return claimsResolver.apply(claims);
    }

    private Claims getAllClaimsFromToken(String token) {
        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
    }
    SDFSFJKLJL*/
}