package com.veera.service;

import com.veera.data.Employee;
import com.veera.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> getAllEmps() {
        return employeeRepo.findAll();
    }
}