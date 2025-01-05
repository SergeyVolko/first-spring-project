package com.example.groovyspring;

import com.example.groovyspring.modells.FirstBean;
import com.example.groovyspring.modells.PrototypeBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;

@SpringBootApplication
public class GroovySpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(GroovySpringApplication.class, args);
        ApplicationContext context = new GenericGroovyApplicationContext("classpath:applicationContext.groovy");

        FirstBean firstBean1 = context.getBean("firstBean", FirstBean.class);
        FirstBean firstBean2 = context.getBean("firstBean", FirstBean.class);
        System.out.println("Are both beans singletone the same? " + (firstBean1 == firstBean2));

        PrototypeBean prototypeBean1 = context.getBean("prototypeBean", PrototypeBean.class);
        PrototypeBean prototypeBean2 = context.getBean("prototypeBean", PrototypeBean.class);
        System.out.println("Are both beans prototype the same? " + (prototypeBean1 == prototypeBean2));
    }
}
