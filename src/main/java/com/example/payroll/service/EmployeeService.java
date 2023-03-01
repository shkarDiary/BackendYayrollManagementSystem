package com.example.payroll.service;

import com.example.payroll.model.Employee;
import com.example.payroll.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository EmployeeRepository;
    public void addEmployee(Employee Employee){
        EmployeeRepository.save(Employee);
    }
    public Optional<Employee> searchById(Integer id){
        return EmployeeRepository.findById(id);
    }
    public List<Employee> getAll(){
        return EmployeeRepository.findAll();
    }
    public void delete(Integer id){
        EmployeeRepository.deleteById(id);
    }
}
