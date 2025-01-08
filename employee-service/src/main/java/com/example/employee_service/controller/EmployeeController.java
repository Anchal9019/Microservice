package com.example.employee_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee_service.entity.Department;
import com.example.employee_service.entity.Employee1;
import com.example.employee_service.entity.Employee1DepartmentDao;
import com.example.employee_service.service.EmployeeService;
import com.example.employee_service.service.IEmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService;

	@Autowired
	private DepartmentClient departmentClient;

	@PostMapping("/save")
	public ResponseEntity<Employee1> save(@RequestBody Employee1 employee1) {
		return new ResponseEntity<Employee1>(employeeService.saveEmp(employee1), HttpStatus.CREATED);
	}

	@GetMapping("/find/{id}")
	public ResponseEntity<Employee1DepartmentDao> findById(@PathVariable Integer id) {
		
		  Employee1 emp = employeeService.findById(id);
		  Department dept =departmentClient.findById(id);
		  Employee1DepartmentDao ed = new Employee1DepartmentDao(); 
//		  ed.setName(emp.getName()); 
//		  ed.setDeptName(dept.getDeptName()); 
		  ed.setDepartment(dept);
		  ed.setEmployee1(emp);
		 
		return new ResponseEntity<Employee1DepartmentDao>(ed, HttpStatus.OK);
	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Employee1> updateEmp(@PathVariable int id, @RequestBody Employee1 employee1) {
		return new ResponseEntity<Employee1>(employeeService.updateEmp(id, employee1), HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteEmp(@PathVariable int id) {
		return new ResponseEntity<String>(employeeService.deleteEmp(id), HttpStatus.OK);

	}
}