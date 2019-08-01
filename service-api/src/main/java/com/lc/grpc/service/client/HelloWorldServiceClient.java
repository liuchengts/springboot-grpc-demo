package com.lc.grpc.service.client;

import com.lc.grpc.HelloWorldGrpc;
import com.lc.grpc.HelloWorldRequest;
import com.lc.grpc.service.HelloWorldService;

/**
 * HelloWorld  service client
 */
public class HelloWorldServiceClient implements HelloWorldService {
    private HelloWorldGrpc.HelloWorldBlockingStub stub;

    public HelloWorldServiceClient(HelloWorldGrpc.HelloWorldBlockingStub stub) {
        this.stub = stub;
    }

    @Override
    public String hello(String name) {
        return stub.hello(HelloWorldRequest.newBuilder().setName(name).build()).getMessage();
    }
}
