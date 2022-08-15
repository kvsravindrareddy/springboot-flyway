package com.veera.controller;

import com.veera.data.Employee;
import com.veera.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpRestController {

    @Autowired
    private EmpService empService;

    @GetMapping("/emps")
    public List<Employee> getAllEmps() {
        return empService.getAllEmps();
    }
}