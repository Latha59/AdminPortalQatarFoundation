package com.palle.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class OpportunityEntity {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String name;
	    private String duration;
	    private String startDate;
	    private String description;
	    private String skills;
	    private String category;
	    private String futureOpportunities;
	    private Integer maxApplicants;

	    @ManyToOne
	    private AdminEntity admin;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDuration() {
			return duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public String getStartDate() {
			return startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSkills() {
			return skills;
		}

		public void setSkills(String skills) {
			this.skills = skills;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getFutureOpportunities() {
			return futureOpportunities;
		}

		public void setFutureOpportunities(String futureOpportunities) {
			this.futureOpportunities = futureOpportunities;
		}

		public Integer getMaxApplicants() {
			return maxApplicants;
		}

		public void setMaxApplicants(Integer maxApplicants) {
			this.maxApplicants = maxApplicants;
		}

		public AdminEntity getAdmin() {
			return admin;
		}

		public void setAdmin(AdminEntity admin) {
			this.admin = admin;
		}
	    
	    

	    // getters & setters
	}


