package com.dhakad.om.employee.controller;

import com.dhakad.om.employee.model.Employee;
import com.dhakad.om.employee.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class EmployeeController {

    EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("employee")
    List<Employee> getAllEmployee() {
        return employeeService.findAllEmployee();
    }

    @GetMapping("employee/id/{id}")
    Employee getEmployeeById(@PathVariable int id) {
        return employeeService.findEmployeeById(id);
    }

    @GetMapping("employee/name/{name}")
    Employee getEmployeeByName(@PathVariable String name) {
        return employeeService.findEmployeeByName(name);
    }

    @PostMapping("employee")
    int createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @DeleteMapping("employee/{id}")
    Integer deleteEmployee(@PathVariable int id) {
        return employeeService.deleteEmployee(id);
    }
}
