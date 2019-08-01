package com.lc.grpc.client;

import com.lc.grpc.service.client.HelloWorldServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @Autowired
    HelloWorldServiceClient helloWorldServiceClient;

    @GetMapping("grpc")
    public String test() {
        return helloWorldServiceClient.hello("lc");
    }
}
