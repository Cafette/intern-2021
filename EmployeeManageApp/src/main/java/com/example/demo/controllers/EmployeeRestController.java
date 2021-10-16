package com.example.demo.controllers;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.entities.Employee;
import com.example.demo.models.repositories.EmployeeRepository;

import lombok.val;

@RestController
@RequestMapping("/api/employee")
public class EmployeeRestController {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    EntityManager entityManager;

    @PostMapping("/register")
    public Employee register(
            @RequestParam("name") String name,
            @RequestParam("tel") String tel,
            @RequestParam("postalCode") String postalCode,
            @RequestParam("address") String address
    ) {


        val employee = new Employee();
        int userId = 0;

        // テーブル内の社員の件数を取得
        long lastId = (long)entityManager.
                createQuery("select count(e.user_id) from Employee e").
                getSingleResult();

        if(lastId == 0) {

        	// テーブルに社員が未登録の場合は社員番号=1
        	userId = 1;

        }else {

        	// 既に社員が登録されている場合は現在の社員IDの最大値を取得
        	userId = (int) entityManager.
                    createQuery("select max(e.user_id) from Employee e").
                    getSingleResult() + 1;

        }

        employee.setUser_id(userId);
        employee.setUser_name(name);
        employee.setPhone_num(tel);
        employee.setZip_cd(postalCode);
        employee.setUser_adr(address);

        //登録
        return employeeRepository.save(employee);
    }


}