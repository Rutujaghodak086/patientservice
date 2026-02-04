package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Patient {
	@Id
	private Integer id;
	private String name;
	private Integer age;
	private String gender;
	private Float mob;
	private String mail;
	private String address;
	private String date;
	
}
