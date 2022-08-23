package com.example.fisSecurityDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class fisSecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		auth.inMemoryAuthentication()
			.withUser("Rishi")
			.password("12345")
			.roles("admin")
			.and()
			.withUser("Satish")
			.password("12345")
			.roles("customer")
			.and()
			.withUser("Anil")
			.password("12345")
			.roles("customer");
			
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http.
		httpBasic()
		.and()
		.authorizeRequests()
		.antMatchers("/deleteUser").hasRole("admin")
		.antMatchers("/display").hasRole("admin")
		.antMatchers("/balance").hasRole("customer")
		.antMatchers("/account").hasAnyRole("admin","customer")
		.antMatchers("/bank").permitAll();
		
}
}
