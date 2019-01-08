package me.likeyao.electronic.ship.web.bean.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Son {

    @Autowired
    private Father father;

    private String name;

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo(){
        System.out.println(String.format("my name is %s, my father is %s.", this.name, this.father.getName()));
    }
}
