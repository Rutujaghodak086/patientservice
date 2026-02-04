package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Patient;

public interface PatientRepository extends JpaRepository<Patient,Integer> {

	Patient findByName(String name);

	Patient findByAge(Integer age);

	Patient findByDate(String date);

	List<Patient> findByGender(String gender);

	

	





}
