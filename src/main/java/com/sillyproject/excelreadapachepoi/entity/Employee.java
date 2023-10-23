package com.sillyproject.excelreadapachepoi.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Employee {
	
	private int id;
	private String name;
	private String emailId;
	private LocalDate dateOfBirth;
	private LocalDateTime dateOfJoining;

}
