package com.palle.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.palle.entity.AdminEntity;
import com.palle.repository.AdminRepository;

@Service
public class AdminService {

        @Autowired
	    private AdminRepository repo;

	    public AdminEntity register(AdminEntity admin) {
	        if(repo.findByEmail(admin.getEmail()).isPresent()) {
	            throw new RuntimeException("Email already exists");
	        }
	        return repo.save(admin);
	    }

	    public AdminEntity login(String email, String password) {
	        AdminEntity admin = repo.findByEmail(email)
	                .orElseThrow(() -> new RuntimeException("Invalid email or password"));

	        if(!admin.getPassword().equals(password)) {
	            throw new RuntimeException("Invalid email or password");
	        }

	        return admin;
	    }
	}

