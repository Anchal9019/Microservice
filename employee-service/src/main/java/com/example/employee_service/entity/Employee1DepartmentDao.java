package com.example.employee_service.entity;


public class Employee1DepartmentDao {
//	private Integer id;
//	private String name;
//	private Integer deptId;
//	private String deptName;
//	
//	
//	public Integer getId() {
//		return id;
//	}
//	public void setId(Integer id) {
//		this.id = id;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public Integer getDeptId() {
//		return deptId;
//	}
//	public void setDeptId(Integer deptId) {
//		this.deptId = deptId;
//	}
//	public String getDeptName() {
//		return deptName;
//	}
//	public void setDeptName(String deptName) {
//		this.deptName = deptName;
//	}
//	public Employee1DepartmentDao(Integer id, String name, Integer deptId, String deptName) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.deptId = deptId;
//		this.deptName = deptName;
//	}
//	public Employee1DepartmentDao() {
//		super();
//		
//	}
	private Employee1 employee1;
	private Department department;
	public Employee1 getEmployee1() {
		return employee1;
	}
	public void setEmployee1(Employee1 employee1) {
		this.employee1 = employee1;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Employee1DepartmentDao() {
		super();
	}
	

}
