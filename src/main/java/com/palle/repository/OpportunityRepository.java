package com.palle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.palle.entity.AdminEntity;
import com.palle.entity.OpportunityEntity;

@Repository
	public interface OpportunityRepository extends JpaRepository<OpportunityEntity, Long> {
	    List<OpportunityEntity> findByAdmin(AdminEntity admin);
	}


