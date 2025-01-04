package com.example.javaspring.modells;

import org.springframework.stereotype.Component;

@Component
public class FirstBean {

    private final PrototypeBean prototypeBean;

    public FirstBean(PrototypeBean prototypeBean) {
        this.prototypeBean = prototypeBean;
        System.out.println("First bean created");
        System.out.println(prototypeBean);
    }
}
