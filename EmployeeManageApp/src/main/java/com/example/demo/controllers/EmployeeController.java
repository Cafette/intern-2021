package com.example.demo.controllers;

import com.example.demo.models.entities.Employee;
import com.example.demo.models.repositories.EmployeeRepository;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EntityManager entityManager;

    @GetMapping("/register")
    public String index() {
        return "Employee";
    }


}