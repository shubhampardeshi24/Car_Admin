package com.car.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.car.dto.Admin;
import com.car.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	private AdminService service;
	
	@PostMapping("create")
	public ResponseEntity createAdminAccount(@Valid @RequestBody Admin admin) {
		if(service.createAccount(admin)!=null) {
			return new ResponseEntity<>(service.createAccount(admin),HttpStatus.ACCEPTED);
		}else {
			return new ResponseEntity<>("Server issue", HttpStatus.NOT_ACCEPTABLE);
		}
	}
}
