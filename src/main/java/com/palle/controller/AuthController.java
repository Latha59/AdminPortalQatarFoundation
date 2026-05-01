package com.palle.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.palle.entity.AdminEntity;
import com.palle.service.AdminService;

@RestController
@RequestMapping("/auth")


public class AuthController {
	
	

	    @Autowired
	    private AdminService service;

	    @PostMapping("/signup")
	    public ResponseEntity<?> signup(@RequestBody AdminEntity admin) {
	        return ResponseEntity.ok(service.register(admin));
	    }

	    @PostMapping("/login")
	    public ResponseEntity<?> login(@RequestBody AdminEntity admin) {
	        return ResponseEntity.ok(
	                service.login(admin.getEmail(), admin.getPassword())
	        );
	    }
	}





