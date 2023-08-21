package com.day1a.day1a.exercise1a;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ApiController {
	
	@Value("1")
	public int id;
	@Value("Nithya")
	public String employeeName;
	@Value("20")
	public String employeeAge;
	@Value("50000")
	public long salary;
	@GetMapping("/employee")
	public String employee()
	{
		return id+" - "+employeeName+" - "+employeeAge+" - "+salary;
	}
}