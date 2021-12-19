package serg.goncharik.black13cat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import serg.goncharik.black13cat.entities.Cat;
import serg.goncharik.black13cat.entities.Dog;
import serg.goncharik.black13cat.entities.Parrot;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("serg.goncharik.black13cat.entities");

        Cat cat = context.getBean(Cat.class);
        cat.setName("Noir");
        Dog dog = (Dog)context.getBean("dog");
        dog.setName("Sobaka");
        Parrot parrot = context.getBean("parrot-kesha", Parrot.class);

        System.out.println("Cat name - " + cat.getName());
        System.out.println("Dog name - " + dog.getName());
        System.out.println("Parrot name - " + parrot.getName());

    }
}
