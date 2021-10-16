package com.example.demo.controllers;

import com.example.demo.models.entities.Employee;
import com.example.demo.models.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import javax.persistence.EntityManager;

@Controller
@RequestMapping("/employee")
public class EmployeeListController {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EntityManager entityManager;

    @GetMapping("/show")
    public String index(Model model) {

        List<Employee> employeeList = employeeRepository.findAll();

        model.addAttribute("employeeList", employeeList);

        return "EmployeeList";
    }


}