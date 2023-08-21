package com.day1a.day1a.exercise1a;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiControllerex1b {
@GetMapping("name")
public String getName(@RequestParam String name) {
	return "Welcome "+name+" !";
}
}
