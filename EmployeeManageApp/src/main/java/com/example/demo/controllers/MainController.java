package com.example.demo.controllers;


import com.example.demo.models.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/")
    public String index() {
        return "Menu";
    }


}