package serg.goncharik.black13cat.entities;

import org.springframework.stereotype.Component;

@Component
public class Cat {

    private String name;

    public Cat(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
