package serg.goncharik.black13cat.entities;

import org.springframework.stereotype.Component;

@Component
public class Dog {

    private String name;

    public Dog(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
