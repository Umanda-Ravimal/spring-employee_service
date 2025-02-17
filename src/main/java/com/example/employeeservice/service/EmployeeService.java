package com.example.employeeservice.service;

import com.example.employeeservice.model.Employee;

public interface EmployeeService {
    Employee saveEmployee(Employee employee);
    Employee getEmployeeById(Long employeeId);
}