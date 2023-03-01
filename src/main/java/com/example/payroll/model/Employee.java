package com.example.payroll.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
public class Employee {
    @Id
    Integer emp_id;
    String emp_name;
    Integer emp_salary;
    Integer emp_dept_id;


}
