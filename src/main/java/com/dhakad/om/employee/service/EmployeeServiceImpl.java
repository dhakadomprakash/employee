package com.dhakad.om.employee.service;

import com.dhakad.om.employee.model.Employee;
import com.dhakad.om.employee.repo.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> findAllEmployee() {
        return employeeRepository.findAll();
    }

    public Employee findEmployeeById(int id) {
        return employeeRepository.findById(id);
    }

    public Employee findEmployeeByName(String name) {
        return employeeRepository.findByName(name);
    }

    public Integer deleteEmployee(int id) {
        return employeeRepository.deleteById(id);
    }

    public int saveEmployee(Employee employee) {
        return employeeRepository.save(employee).getId();
    }
}
