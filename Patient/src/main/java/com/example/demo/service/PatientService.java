package com.example.demo.service;

import java.awt.Paint;
import java.util.List;

import com.example.demo.model.Patient;

public interface PatientService {

	void add(Patient p);

	List<Patient> display();

	void delete(Integer id);

	Patient searchById(Integer id);

	Patient update(Integer id, Patient p);

}
