package com.upstart.springboot_task01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.upstart.springboot_task01.dto.MessageDto;

@RestController
public class Task01Controller {
	@GetMapping("/health")
	public MessageDto getHealthStatus() {
		MessageDto m = new MessageDto("This REST API is working perfectly", "Good");
		return m;
	}
	
	@GetMapping("/greet")
	public MessageDto greet(@RequestParam(defaultValue = "Intern") String name) {
		String customMessage = "Hello "+name+"! Welcome to Spring Boots";
		return new MessageDto(customMessage, "Successfull");
	}
}
