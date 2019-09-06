package com.example.eurekaconsumerdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class HelloController {

    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody
    @RequestMapping("hello")
    public String hello(){
        return restTemplate.getForObject("http://SERVICE-DEMO/hello/",String.class);
    }
}
