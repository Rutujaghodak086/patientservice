package com.example.demo.service;

import java.awt.Paint;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Patient;
import com.example.demo.repository.PatientRepository;
@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository pr;
	
	@Override
	public void add(Patient p) {
		// TODO Auto-generated method stub
		pr.save(p);
		
	}

	@Override
	public List<Patient> display() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		pr.deleteById(id);
	}

	@Override
	public Patient searchById(Integer id) {
		// TODO Auto-generated method stub
		return pr.findById(id).get();
	}

	@Override
	public Patient update(Integer id, Patient p) {
		// TODO Auto-generated method stub
		p.setId(id);
		return pr.save(p);
	}

}
