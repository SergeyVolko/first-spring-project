package com.example.javaspring.modells;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class RequestScopeBean {

    public RequestScopeBean() {
        System.out.println("Hello, the request scope created!");
    }
}
