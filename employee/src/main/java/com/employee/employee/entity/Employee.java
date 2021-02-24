package com.employee.employee.entity;

import javax.persistence.*;

@Entity
@Table(name="Employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String empName;
    private Double salary;
    public Employee(Integer id, String empName, Double salary) {
        this.id = id;
        this.empName = empName;
        this.salary = salary;
    }
    public Employee() {
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }


}
