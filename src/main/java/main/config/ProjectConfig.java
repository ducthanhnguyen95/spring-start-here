package main.config;

import main.Parrot;
import main.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "main")
public class ProjectConfig {

//    @Bean
//    @Primary
//    Parrot parrot() {
//        var p = new Parrot();
//        p.setName("Koko");
//        return p;
//    }
//
//    @Bean
//    Parrot parrot1() {
//        var p = new Parrot();
//        p.setName("Koko");
//        return p;
//    }
//    @Bean
//    Parrot parrot2() {
//        var p = new Parrot();
//        p.setName("Miki");
//        return p;
//    }
//
//    @Bean
//    Parrot parrot3() {
//        var p = new Parrot();
//        p.setName("Riki");
//        return p;
//    }
//
//    @Bean
//    String hello() {
//        return "Hello";
//    }
//
//    @Bean
//    String thanks() {
//        return "Thanks";
//    }
//
//    @Bean
//    Integer ten() {
//        return 10;
//    }


//    @Bean
//    public Person person(Parrot parrot) {
//        Person p = new Person();
//        p.setName("Ella");
//        p.setParrot(parrot);
//        return p;
//    }
//
//
//    public Parrot parrot() {
//        Parrot p = new Parrot();
//        p.setName("Koko");
//        return p;
//    }


//    public Parrot parrot(String name) {
//        Parrot p = new Parrot();
//        p.setName(name);
//        return p;
//    }

    @Bean
    @Primary
    public Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    public Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }

//    @Bean
//    public Person person(
//            @Qualifier ("parrot2")
//                             Parrot parrot) {
//        Person p = new Person();
//        p.setName("Ella");
//        p.setParrot(parrot);
//        return p;
//    }
}
