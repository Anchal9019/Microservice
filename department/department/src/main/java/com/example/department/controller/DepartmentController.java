package com.example.department.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.department.entity.Department;
import com.example.department.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;

	@PostMapping("/save")
	public ResponseEntity<Department> save(@RequestBody Department department) {
		return new ResponseEntity<Department>(departmentService.saveDepartment(department), HttpStatus.CREATED);
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Department> findById(@PathVariable("id") Integer id) {
		return new ResponseEntity<Department>(departmentService.findById(id), HttpStatus.OK);
	}
}
