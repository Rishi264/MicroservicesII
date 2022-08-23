package com.example.cloudgateway;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {
		@Autowired 
		Configuration config;
		
		
		@GetMapping("/limits")
		public Limits getLimits() {
			return new Limits(config.getMinimum(), config.getMaximum());
		}
}

