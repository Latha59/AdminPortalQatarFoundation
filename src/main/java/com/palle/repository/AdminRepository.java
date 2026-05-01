package com.palle.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.palle.entity.AdminEntity;

@Repository
	public interface AdminRepository extends JpaRepository<AdminEntity, Long> {
	    Optional<AdminEntity> findByEmail(String email);
	}


