package com.example.demo.controller;

import java.awt.Paint;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Patient;
import com.example.demo.service.PatientService;

@RestController
public class PatientController {
	
	@Autowired
	private PatientService ps;
	
	@PostMapping("add")
	public void add(@RequestBody Patient p) {
		ps.add(p);
	}
	
	@GetMapping("display")
	public List<Patient>display(){
		return ps.display();
	}
	
	@PostMapping("search={id}")
	public Patient searchById(@PathVariable Integer id) {
		return ps.searchById(id);
	}

	@DeleteMapping("delete={id}")
	public void delete(@PathVariable Integer id) {
		ps.delete(id);
	}
	
	@PostMapping("update={id}")
	public Patient update(@PathVariable Integer id,@RequestBody Patient p) {
		return ps.update(id,p);
	}
}
