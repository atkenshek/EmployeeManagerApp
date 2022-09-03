package com.atkenshek.employeemanager.service;

import com.atkenshek.employeemanager.exceptions.UserNotFoundException;
import com.atkenshek.employeemanager.model.Employee;
import com.atkenshek.employeemanager.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private final EmployeeRepo employeeRepo;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
        this.employeeRepo = employeeRepo;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        employee.setEmployeeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    @Override
    public List<Employee> findEmployees() {
        return employeeRepo.findAll();
    }

    @Override
    public Employee updateEmployee(Employee employee) {
       return employeeRepo.save(employee);
    }

    @Override
    public void deleteEmployeeById(Long id) {
        employeeRepo.deleteEmployeeById(id);
    }

    @Override
    public Employee findEmployeeById(Long id) {
        return employeeRepo.findEmployeeById(id)
            .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }


}
