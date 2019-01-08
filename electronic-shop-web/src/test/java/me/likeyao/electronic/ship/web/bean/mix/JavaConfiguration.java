package me.likeyao.electronic.ship.web.bean.mix;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "me.likeyao.electronic.ship.web.bean.mix")
@PropertySource("annotation/config.properties")
public class JavaConfiguration {

    @Bean
    Son son(Father father){
        Son son = new Son();
        son.setName("Adam Smith");
        son.setFather(father);
        return son;
    }

}
