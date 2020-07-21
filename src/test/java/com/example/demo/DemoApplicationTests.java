package com.example.demo;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
@ComponentScan({"com.example.demo","com.example.security"})
class DemoApplicationTests {

	@Autowired
	private UsuarioRepository usuariorepository;

	@Autowired
	private BCryptPasswordEncoder encoder;

	@Test
	public void crearUsuarioTest(){
		final Location l = new Location("l7", "Prueba");
		final Usuario us = new Usuario("u10", "Edwin2", l, "emlara35@gmail.com", encoder.encode("123"));
		Usuario retorno = usuariorepository.save(us);
		assertTrue(retorno.getPassword().equalsIgnoreCase(us.getPassword()));

	}

}
