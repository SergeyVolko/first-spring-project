package com.example.groovyspring.modells;

public class FirstBean {

    private final PrototypeBean prototypeBean;

    public FirstBean(PrototypeBean prototypeBean) {
        this.prototypeBean = prototypeBean;
        System.out.println("First bean created");
        System.out.println(prototypeBean);
    }
}
