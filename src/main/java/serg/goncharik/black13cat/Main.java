package serg.goncharik.black13cat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import serg.goncharik.black13cat.configs.MyConfig;
import serg.goncharik.black13cat.entities.Cat;
import serg.goncharik.black13cat.entities.Dog;
import serg.goncharik.black13cat.entities.Parrot;
import serg.goncharik.black13cat.entitiesForJavaConfiguration.Cook;
import serg.goncharik.black13cat.entitiesForJavaConfiguration.Dancer;
import serg.goncharik.black13cat.entitiesForJavaConfiguration.Engenier;


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

        ApplicationContext contextConfig = new AnnotationConfigApplicationContext(MyConfig.class);  // если таких конфигов много то перечисляем через запятую
                                                                                                    //либо если их слишком много то можно указать пакет(если пакет не один - через запятую)

        Engenier engenier1 = contextConfig.getBean(Engenier.class);
        engenier1.toCreateSomething();

        Cook cook1 = contextConfig.getBean(Cook.class);
        cook1.setName("cook1name");
        System.out.println(cook1.getName());

        Dancer dancer1 = contextConfig.getBean("streetDancer", Dancer.class);
        System.out.println(dancer1.getName());

//        Cook cook2 = contextConfig.getBean("streetCook", Cook.class);
//        System.out.println(cook2.getName());




    }
}
