package me.likeyao.electronic.ship.web.bean.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");
        Son son = context.getBean(Son.class);
        son.printInfo();
    }
}
