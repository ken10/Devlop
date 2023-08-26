package com.example.ken.limitsmicroservices.controller;


import com.example.ken.limitsmicroservices.beans.Limits;
import com.example.ken.limitsmicroservices.configuration.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsController {


    @Autowired
    private Configuration config;

    @GetMapping("/limits")
    public Limits allLimits()
    {

        System.out.println("Inside Limit controller");
        //return new Limits(1,1);
        return new Limits(config.getMin(), config.getMax());

    }


    @GetMapping("/fun")
    public String fun(){

        return "LimitsController/fun";
    }
}
