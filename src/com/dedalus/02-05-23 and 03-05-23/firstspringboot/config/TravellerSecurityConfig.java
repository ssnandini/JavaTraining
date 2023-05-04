package com.nan.firstspringboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity(debug = true)
public class TravellerSecurityConfig {
	
@Bean
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	http.authorizeHttpRequests()
    .requestMatchers("/welcome/**").permitAll()
    .requestMatchers("/addtraveller/**").authenticated()
	.requestMatchers("/deletetravellers/**").authenticated();
    http.httpBasic();
    http.csrf().disable();
    return http.build();
    }
}

