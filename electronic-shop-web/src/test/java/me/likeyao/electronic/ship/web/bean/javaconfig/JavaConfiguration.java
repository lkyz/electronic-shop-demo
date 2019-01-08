package me.likeyao.electronic.ship.web.bean.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfiguration {

    @Bean
    Father father(){
        Father father = new Father();
        father.setName("Will Smith");
        return father;
    }

    @Bean
    Son son(Father father){
        Son son = new Son();
        son.setFather(father);
        son.setName("Adam Smith");
        return son;
    }

}
