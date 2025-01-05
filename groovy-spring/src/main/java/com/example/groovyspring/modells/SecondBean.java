package com.example.groovyspring.modells;

public class SecondBean {

    private PrototypeBean prototypeBean;

    public SecondBean(PrototypeBean prototypeBean) {
        this.prototypeBean = prototypeBean;
        System.out.println("Second bean created!");
        System.out.println(prototypeBean);
    }

    public PrototypeBean getPrototypeBean() {
        return prototypeBean;
    }
}
