package com.palle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.palle.entity.AdminEntity;
import com.palle.entity.OpportunityEntity;
import com.palle.repository.OpportunityRepository;

@Service
public class OpportunityService {
	
	

	    @Autowired
	    private OpportunityRepository repo;

	    public OpportunityEntity create(OpportunityEntity opp) {
	        return repo.save(opp);
	    }

	    public List<OpportunityEntity> getAll(AdminEntity admin) {
	        return repo.findByAdmin(admin);
	    }

	    public OpportunityEntity update(Long id, OpportunityEntity newOpp) {
	        OpportunityEntity opp = repo.findById(id).orElseThrow();

	        opp.setName(newOpp.getName());
	        opp.setDuration(newOpp.getDuration());
	        opp.setDescription(newOpp.getDescription());

	        return repo.save(opp);
	    }

	    public void delete(Long id) {
	        repo.deleteById(id);
	    }
	}


