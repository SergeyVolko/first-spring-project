package com.example.javaspring.modells;

import org.springframework.stereotype.Component;

@Component
public class SecondBean {

    private final PrototypeBean prototypeBean;

    public SecondBean(PrototypeBean prototypeBean) {
        this.prototypeBean = prototypeBean;
        System.out.println("Second bean created!");
        System.out.println(prototypeBean);
    }
}
