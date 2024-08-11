package com.mashibing.springboot.controller;

import com.mashibing.springboot.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Person person;
    @RequestMapping("/hello")
    public String Hello(){
        return  "hello";
    }

    @RequestMapping("/hello2")
    public String Hello2(){
        return  person.toString();
    }
}
