package com.example.employee_service.controller;

import org.springframework.cloud.openfeign.FeignClient;
//import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;

import com.example.employee_service.entity.Department;

//import com.example.employee_service.entity.Department;
//import com.example.employee_service.entity.Employee1DepartmentDao;

@FeignClient(name="department-service" ,url="http://localhost:8088")
public interface DepartmentClient {

//	@PostMapping("/department/save")
//	public ResponseEntity<String> saveDepartment(@RequestBody Employee1DepartmentDao employee1DepartmentDao);

	@GetMapping("/department/find/{id}")
	public Department findById(@PathVariable("id") Integer id);
}
