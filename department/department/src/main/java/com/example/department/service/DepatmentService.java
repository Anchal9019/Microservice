package com.example.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.department.Repository.DeptartmentRepository;
import com.example.department.entity.Department;

@Service
public class DepatmentService implements DepartmentService{

	@Autowired
	private DeptartmentRepository departmentRepository;
	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	@Override
	public Department findById(Integer deptId) {
		
		return departmentRepository.findById(deptId).orElse(null);
	}

}
