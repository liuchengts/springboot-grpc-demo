package com.lc.grpc.server.grpc.impl;

import com.lc.grpc.service.HelloWorldReply;
import com.lc.grpc.service.HelloWorldRequest;
import com.lc.grpc.service.HelloWorldService;
import com.lc.grpc.service.ReactorHelloWorldGrpc;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;

@GRpcService
public class HelloWorldServiceGrpcStubImpl extends ReactorHelloWorldGrpc.HelloWorldImplBase {

    @Autowired
    HelloWorldService helloWorldService;

    @Override
    public Mono<HelloWorldReply> hello(Mono<HelloWorldRequest> request) {
        return request.map(helloRequest -> HelloWorldReply.newBuilder().setMessage(helloWorldService.hello(helloRequest.getName())).build());


    }

}
