package com.example.day6.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.day6.entity.ChildEntity;
import com.example.day6.repository.ChildRepository;

@Service
public class ChildServiceImplement implements ChildService{
	
	@Autowired
	private ChildRepository childrepository;
	
	@Override
	public ChildEntity saveData(ChildEntity childentity) {
		return childrepository.save(childentity);
	}
	
	@Override
	public ResponseEntity<String> saveDetails(List<ChildEntity> childentity) {
	    childrepository.saveAll(childentity);
	    return ResponseEntity.ok("data added");
		 
	}
	
	
	@Override
	public ChildEntity getChildren(int id) {
		Optional<ChildEntity > optional=childrepository.findById(id);
		if(optional.isEmpty()) {
			return null;
		}
		return optional.get();
	}
	@Override
	 public Page<ChildEntity> getChildByField(int pageNo, int pageSize,String field) {
		Sort sort= Sort.by(field);
	        Pageable pageable = PageRequest.of(pageNo, pageSize, sort);
	        return childrepository.findAll(pageable);
	    }

}
