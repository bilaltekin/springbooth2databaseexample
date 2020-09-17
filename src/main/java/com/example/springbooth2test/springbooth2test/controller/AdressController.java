package com.example.springbooth2test.springbooth2test.controller;

import com.example.springbooth2test.springbooth2test.entity.Adress;
import com.example.springbooth2test.springbooth2test.entity.Student;
import com.example.springbooth2test.springbooth2test.repository.AdressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api")
public class AdressController {

    @Autowired
    AdressRepo adressRepo;

    @GetMapping("adress")
    List<Adress> all() {

        return adressRepo.findAll();

    }

}
