package com.example.xmlspring.modells;

public class SecondBean {

    private final PrototypeBean prototypeBean;

    public SecondBean(PrototypeBean prototypeBean) {
        this.prototypeBean = prototypeBean;
        System.out.println("Second bean created!");
        System.out.println(prototypeBean);
    }
}
