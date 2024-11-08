package com.mka.employeeProject.dao;

import com.mka.employeeProject.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
  List<Employee> findAllEmployees();

  Employee findEmployeeById(Long id);

  void createEmployee(Employee employee);

  Employee updateEmployee(Employee employee);

  void deleteEmployee(Long id);
}
