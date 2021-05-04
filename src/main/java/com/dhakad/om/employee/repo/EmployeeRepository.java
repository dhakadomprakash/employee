package com.dhakad.om.employee.repo;

import com.dhakad.om.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    Employee findById(int id);

    Employee findByName(String name);

    @Transactional
    Integer deleteById(int id);
}
