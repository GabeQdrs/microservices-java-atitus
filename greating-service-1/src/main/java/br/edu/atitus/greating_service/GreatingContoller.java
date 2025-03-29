package br.edu.atitus.greating_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/greating-service")
public class GreatingContoller {

	@GetMapping
	public String getGreating() {
		return "Hello World!";
	}
}
