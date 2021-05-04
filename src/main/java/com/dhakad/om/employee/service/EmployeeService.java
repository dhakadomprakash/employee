package com.dhakad.om.employee.service;

import com.dhakad.om.employee.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAllEmployee();

    Employee findEmployeeById(int id);

    Employee findEmployeeByName(String name);

    Integer deleteEmployee(int id);

    int saveEmployee(Employee employee);
}
