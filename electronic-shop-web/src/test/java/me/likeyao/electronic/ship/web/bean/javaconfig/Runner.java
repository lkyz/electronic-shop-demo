package me.likeyao.electronic.ship.web.bean.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext();
        context.register(JavaConfiguration.class);
        context.refresh();
        Son son = context.getBean(Son.class);
        son.printInfo();
    }
}
