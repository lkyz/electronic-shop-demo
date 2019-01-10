package me.likeyao.electronic.shop.web.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

@Conditional(SimpleFalseCondition.class)
@Configuration
public class ConditionConfiguration {

    @Bean
    Date date(){
        return new Date();
    }
}
