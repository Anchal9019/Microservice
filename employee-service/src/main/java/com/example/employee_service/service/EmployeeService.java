package com.example.employee_service.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.employee_service.entity.Employee1;
import com.example.employee_service.exception.DataNotFoundException;
import com.example.employee_service.repository.EmployeeRepository;


@Service
public class EmployeeService implements IEmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee1 saveEmp(Employee1 employee1) {
		// TODO Auto-generated method stub
		return employeeRepository.save(employee1);
	}

	@Override
	public Employee1 findById(Integer id) {
		return employeeRepository.findById(id).get();
		
	}

	@Override
	public Employee1 updateEmp(int id, Employee1 employee1) {
		// TODO Auto-generated method stub
		Optional<Employee1> emp= employeeRepository.findById(id);
		if(emp.isPresent()) {
			Employee1 e1=emp.get();
			if(employee1.getName()!=null) {
				e1.setName(employee1.getName());
			}
			if(employee1.getEmail()!=null) {
				e1.setEmail(employee1.getEmail());
			}
			return employeeRepository.save(e1);
		}
		else {
			throw new DataNotFoundException("Employee1 not found");
		}
	}

	@Override
	public String deleteEmp(int id) {
		// TODO Auto-generated method stub
		Optional<Employee1> e=employeeRepository.findById(id);
		if(e.isPresent()) {
			Employee1 e2=e.get();
			employeeRepository.delete(e2);
			return "Deleted successfully";
		}
		else {
			throw new DataNotFoundException("Employee1 not found");
		}
	}

}
