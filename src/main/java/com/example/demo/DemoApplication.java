package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef="auditorAware")
@ComponentScan({"com.example.demo","com.example.security"})
public class DemoApplication {

	@Autowired
	private static UsuarioRepository usuariorepository;

	public static void main(final String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		Location l = new Location("l7", "Prueba");

		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

		Usuario us = new Usuario("u10", "Edwin2", l, "emlara35@gmail.com", bCryptPasswordEncoder.encode("123"));
		usuariorepository.save(us);
	}

	@Bean
	public AuditorAware<String> auditorAware() {
		return new SpringSecurityAuditorAware();
	}
}
