package me.likeyao.electronic.ship.web.bean.annotation;

import org.springframework.stereotype.Component;

@Component
public class Father {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
