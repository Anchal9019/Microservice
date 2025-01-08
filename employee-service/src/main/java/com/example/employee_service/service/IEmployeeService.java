package com.example.employee_service.service;

import com.example.employee_service.entity.Employee1;

public interface IEmployeeService {
  Employee1 saveEmp(Employee1 employee1);
  Employee1 findById(Integer id);
  Employee1 updateEmp(int id,Employee1 employee1);
  String deleteEmp(int id);
}
