package com.atkenshek.employeemanager.service;

import com.atkenshek.employeemanager.model.Employee;

import java.util.List;

public interface EmployeeService {
     Employee addEmployee(Employee employee);
     List<Employee> findEmployees();
     Employee updateEmployee(Employee employee);
     void deleteEmployeeById(Long id);
     Employee findEmployeeById(Long id);
}
