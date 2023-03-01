package com.example.payroll.controller;

import com.example.payroll.model.Department;
import com.example.payroll.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    @PostMapping("/add")
    public void add(@RequestBody Department department){
        departmentService.addDepartment(department);
    }
    @DeleteMapping ("/delete")
    public void delete(@RequestParam Integer id){
        departmentService.delete(id);
    }
    @GetMapping("/get")
    public Optional<Department> get(@RequestParam Integer id){
        return departmentService.searchById(id);
    }
    @GetMapping("/getAll")
    public List<Department> add(){
        return departmentService.getAll();
    }
}
