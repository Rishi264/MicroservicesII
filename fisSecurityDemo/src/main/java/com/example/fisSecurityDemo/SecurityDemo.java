package com.example.fisSecurityDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SecurityDemo {
		@GetMapping("/bank")
		public String getBankDetails() {
			return "These are bank details";
		}
		
		@GetMapping("/deleteUser")
		public String getDeleteUserDetails() {
			return "The user is deleted";
		}
		
		@GetMapping("/balance")
		public String getBalanceDetails() {
			return "These are balance details";
		}
		
		@GetMapping("/account")
		public String getAccountDetails() {
			return "These are account details";
		}
		
		@GetMapping("/display")
		public String getDisplay() {
			return "This is a Display Method";
		}
		
		
		@GetMapping("/color")
		public String getFavColorDetails() {
			return "My Favourite color is: Red";
		}
		
		
		@GetMapping("/location")
		public String getLocationDetails() {
			return "My Current Location is: New York";
		}
}
/*package com.example.fisSecurityDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@EnableWebSecurity
public class FisDemoCongis extends WebSecurityConfigurerAdapter{ 
			
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
	
	
	
}*/