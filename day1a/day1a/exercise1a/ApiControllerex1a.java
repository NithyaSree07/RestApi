package com.day1a.day1a.exercise1a;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiControllerex1a {

	@GetMapping("welcome")
	public String Display() {
		return "Welcome";
	}
	
}
