package com.example.payroll.controller;

import com.example.payroll.model.Employee;
import com.example.payroll.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/add")
    public void add(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }
    @DeleteMapping("/delete")
    public void delete(@RequestParam Integer id){
        employeeService.delete(id);
    }
    @GetMapping("/get")
    public Optional<Employee> get(@RequestParam Integer id){
        return employeeService.searchById(id);
    }
    @GetMapping("/getAll")
    public List<Employee> getAll(){
        return employeeService.getAll();
    }
}
