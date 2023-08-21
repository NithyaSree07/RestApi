package com.demo.day2.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
       @Value("${var}")
       private String name;
       
       @GetMapping("/name")
       
       public String show() {
    	   return "Hello Everyone.This is !"+ name;
       }
}
