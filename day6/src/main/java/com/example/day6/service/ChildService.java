package com.example.day6.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import com.example.day6.entity.ChildEntity;


public interface ChildService {

	ChildEntity saveData(ChildEntity childentity);

	Page<ChildEntity> getChildByField(int pageNo, int pageSize, String field);

	ResponseEntity<String> saveDetails(List<ChildEntity> product);

	ChildEntity getChildren(int id);
}
