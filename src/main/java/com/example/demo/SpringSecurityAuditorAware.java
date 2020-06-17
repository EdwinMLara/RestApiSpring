package com.example.demo;

import org.springframework.data.domain.AuditorAware;
import java.util.Optional;

public class SpringSecurityAuditorAware implements AuditorAware<String>{
    @Override
	public Optional<String> getCurrentAuditor() {
		return Optional.ofNullable("Kindson").filter(s -> !s.isEmpty());
	}
}