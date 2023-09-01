package com.example.day6.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.day6.entity.ChildEntity;
import com.example.day6.service.ChildService;
@RestController
public class ChildController {
   
	@Autowired
	private ChildService childservice;
	
	@PostMapping("/add")
	public ChildEntity addData(@RequestBody ChildEntity childentity) {
		return childservice.saveData(childentity);
	}
	
	@PostMapping("/addchildren")
	public ResponseEntity<String> addProducts(@RequestBody List<ChildEntity> product) {
		return childservice.saveDetails(product);
	}

	
	@GetMapping("/child/{id}")
	public ResponseEntity<ChildEntity> getChild(@PathVariable int id) {
		ChildEntity childentity = childservice.getChildren(id);
		if (childentity == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
		return ResponseEntity.status(HttpStatus.OK).body(childentity);
	}
	
	@GetMapping("/getpageandsort")
    public ResponseEntity<Page<ChildEntity>> getChildByField(@RequestParam int pageNo, @RequestParam int pageSize,@RequestParam String field) {   
        Page<ChildEntity>childentity = childservice.getChildByField(pageNo,pageSize,field);
        return ResponseEntity.ok(childentity);
    }
}
