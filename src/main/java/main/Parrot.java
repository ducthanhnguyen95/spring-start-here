package main;

import org.springframework.stereotype.Component;

//@Component
public class Parrot {

//    private final Person person;
    private String name = "KoKo";

//    public Parrot(Person person) {
//        this.person = person;
//    }

    //    @PostConstruct
//    public void init() {
//        this.name = "Kiki";
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    public Parrot() {
//        System.out.println("Parrot created");
//    }

    @Override
    public String toString() {
        return "Parrot : " + name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
