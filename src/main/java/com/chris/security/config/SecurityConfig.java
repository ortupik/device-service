package com.chris.security.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class SecurityConfig {

	@Autowired
	private Http401UnauthorizedEntryPoint authenticationEntryPoint;

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.exceptionHandling().authenticationEntryPoint(authenticationEntryPoint).and().authorizeRequests()
				.antMatchers("/device/**").hasAuthority("SCOPE_resource.write").antMatchers("/device-admin/**")
				.hasAuthority("SCOPE_resource.write").anyRequest().authenticated().and().oauth2ResourceServer().jwt();
		return http.build();
	}

}