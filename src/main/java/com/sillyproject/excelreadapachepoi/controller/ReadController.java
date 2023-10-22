package com.sillyproject.excelreadapachepoi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.sillyproject.excelreadapachepoi.service.ReadService;

@RestController
public class ReadController {
	
	@Autowired
	private ReadService readService;
	
	@GetMapping("/read")
	public List<?> readData(@RequestParam("file")  MultipartFile file) {
		return  readService.readData(file);
	}

}
