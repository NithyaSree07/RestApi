package com.day1a.day1a.exercise1a;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class ApiControllerex1c {
@GetMapping("color")
public String getMyFav(@RequestParam String color) {
	return "My favorite color is "+color;
}
}
