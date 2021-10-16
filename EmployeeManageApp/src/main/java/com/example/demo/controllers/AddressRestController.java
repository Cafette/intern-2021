package com.example.demo.controllers;

import com.example.demo.models.entities.Address;
import com.example.demo.models.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/address")
public class AddressRestController {

    @Autowired
    AddressRepository addressRepository;

    @GetMapping("/")
    public Address select(
            @RequestParam("zip_cd") String zip_cd
    ) {
        //取得
        return addressRepository.findById(zip_cd).orElse(null);
    }

}
