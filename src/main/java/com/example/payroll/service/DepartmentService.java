package com.example.payroll.service;

import com.example.payroll.model.Department;
import com.example.payroll.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;
    public void addDepartment(Department department){
        departmentRepository.save(department);
    }
    public Optional<Department> searchById(Integer id){
        return departmentRepository.findById(id);
    }
    public List<Department> getAll(){
        return departmentRepository.findAll();
    }
    public void delete(Integer id){
        departmentRepository.deleteById(id);
    }
}
