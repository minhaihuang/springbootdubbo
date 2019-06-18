package com.hhm.springbootdubbo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.hhm.springbootdubbo.inter.HelloService;
import org.springframework.stereotype.Component;

/**
 * 服务端，发布服务
 */
@Component
@Service(version = "1.0.0",timeout = 10000,interfaceClass = HelloService.class)
public class HelloServiceImpl implements HelloService{
    public String sayHello(String name) {
        return "hello,"+name;
    }
}
