package com.lc.grpc.client;

import com.lc.grpc.server.application.GrpcAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@ImportAutoConfiguration(GrpcAutoConfiguration.class)
@SpringBootApplication
public class ClientDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientDemoApplication.class, args);
    }
}
