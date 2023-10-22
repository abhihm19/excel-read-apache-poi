package com.sillyproject.excelreadapachepoi.entity;

import java.util.Date;

import lombok.Data;

@Data
public class Employee {
	
	private int id;
	private String name;
	private String emailId;
	private Date dateOfJoining;
	private Date punchTime;

}
