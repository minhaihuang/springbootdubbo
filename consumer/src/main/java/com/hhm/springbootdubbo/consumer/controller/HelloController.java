package com.hhm.springbootdubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hhm.springbootdubbo.inter.HelloService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Reference(interfaceClass = HelloService.class,version = "1.0.0")
    private HelloService helloService;

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name){
        String res = helloService.sayHello(name);
        System.out.println(res);
        return res;
    }
}

