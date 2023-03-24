package main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {


    @Autowired
    private Parrot parrot;
    private String name = "Ella";

//    @Autowired
//    public Person(Parrot parrot) {
//        this.parrot = parrot;
//    }


//    public Person(Parrot parrot) {
//        this.parrot = parrot;
//        System.out.println("Person created");
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

//    public void setParrot(Parrot parrot) {
//        this.parrot = parrot;
//    }

//    @Override
//    public String toString() {
//        return "Person{" +
//                "name='" + name + '\'' +
//                ", parrot=" + parrot +
//                '}';
//    }
}
