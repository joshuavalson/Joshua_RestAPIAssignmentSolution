package com.greatlearning.emsapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.greatlearning.emsapp.model.Roles;
import com.greatlearning.emsapp.repository.RolesRepository;

public class RolesService {
	@Autowired
	RolesRepository rolesRepository;

	// CREATE
	public Roles createRole(Roles role) {
		return rolesRepository.save(role);
	}

	// READ
	public List<Roles> getEmployees() {
		return rolesRepository.findAll();
	}

	// DELETE
	public void deleteEmployee(Long empId) {
		rolesRepository.deleteById(empId);
	}

	// UPDATE
	public Roles updateEmployee(Long empId, Roles roles) {
		Roles role = rolesRepository.findById(empId).get();
		role.setRole(roles.getRole());
		role.setUserName(roles.getUserName());

		return rolesRepository.save(role);
	}
}
