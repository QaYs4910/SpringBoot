package com.mashibing.springboot.controller;

import com.mashibing.springboot.entity.Person;
import com.mashibing.springboot.listener.MyHttpSessionListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class HelloController {

    @Autowired
    private Person person;
    @RequestMapping("/hello")
    public String Hello(HttpSession session){
        session.setAttribute("name","zhangsan");
        return  "helloSpringBoot";
    }

    @RequestMapping("/hello2")
    public String Hello2(){
        return  person.toString();
    }

    @RequestMapping("/online")
    public String online(){
        return "当前在线人数:"+ MyHttpSessionListener.online+"人";
    }
}
