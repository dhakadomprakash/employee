package com.dhakad.om.employee.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class Employee {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private int phoneNumber;
    private String passportNumber;
}
