package com.example.department.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.department.entity.Department;


public interface DeptartmentRepository extends JpaRepository<Department, Integer>{

	

}
