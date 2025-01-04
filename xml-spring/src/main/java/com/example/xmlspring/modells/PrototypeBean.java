package com.example.xmlspring.modells;

public class PrototypeBean {

    public PrototypeBean() {
        System.out.println("Hello, this is prototype bean!");
    }

    @Override
    public String toString() {
        return "PrototypeBean:" + Integer.toHexString(System.identityHashCode(this));
    };
}
