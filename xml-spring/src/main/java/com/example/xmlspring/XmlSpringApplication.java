package com.example.xmlspring;

import com.example.xmlspring.modells.FirstBean;
import com.example.xmlspring.modells.PrototypeBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class XmlSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmlSpringApplication.class, args);
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        FirstBean firstBean1 = context.getBean("firstBean", FirstBean.class);
        FirstBean firstBean2 = context.getBean("firstBean", FirstBean.class);
        System.out.println("Are both beans singletone the same? " + (firstBean1 == firstBean2));

        PrototypeBean prototypeBean1 = context.getBean("prototypeBean", PrototypeBean.class);
        PrototypeBean prototypeBean2 = context.getBean("prototypeBean", PrototypeBean.class);
        System.out.println("Are both beans prototype the same? " + (prototypeBean1 == prototypeBean2));

    }

}
