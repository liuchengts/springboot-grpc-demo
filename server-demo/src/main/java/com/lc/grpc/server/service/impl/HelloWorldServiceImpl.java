package com.lc.grpc.server.service.impl;

import com.lc.grpc.service.HelloWorldService;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldServiceImpl implements HelloWorldService {
    @Override
    public String hello(String name) {
        return System.currentTimeMillis() + "hello2 " + name;
    }
}
