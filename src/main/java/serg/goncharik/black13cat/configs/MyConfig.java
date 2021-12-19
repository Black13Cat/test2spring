package serg.goncharik.black13cat.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import serg.goncharik.black13cat.entitiesForJavaConfiguration.Cook;
import serg.goncharik.black13cat.entitiesForJavaConfiguration.Dancer;
import serg.goncharik.black13cat.entitiesForJavaConfiguration.Engenier;

@Configuration
public class MyConfig {

    @Bean
    public Engenier getEngenier(){
        return new Engenier();
    }

    @Bean
    public Cook getCook(){
        return new Cook();
    }

    @Bean("streetDancer")
    public Dancer getDancer(){
        return new Dancer("street");
    }

//    @Bean("streetCook")
//    public Cook getStreetCook(){
//        Cook streetCook = new Cook();
//        streetCook.setName(getDancer().getName() + "Cook");
//        return streetCook;
//    }

}
