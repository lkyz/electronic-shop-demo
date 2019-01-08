package me.likeyao.electronic.shop.web.condition;

import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Conditional(MyCondition.class)
@Configuration
public class ConditionConfiguration {
}
