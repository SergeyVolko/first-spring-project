package com.example.javaspring.modells;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PrototypeBean {

    public PrototypeBean() {
        System.out.println("Hello, this is prototype bean!");
    }

    @Override
    public String toString() {
        return "PrototypeBean:" + Integer.toHexString(System.identityHashCode(this));
    };
}
