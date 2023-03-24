package main;

import main.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
//    public static void main(String[] args) {
//        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//
//        Parrot p = context.getBean(Parrot.class);
//        System.out.println(p);
//        System.out.println(p.getName());
//
////        Parrot x = new Parrot();
////        x.setName("Kiki");
////        Supplier<Parrot> parrotSupplier = Parrot::new;
////        context.registerBean("parrot1", Parrot.class, parrotSupplier);
////        Parrot p = context.getBean(Parrot.class);
////        System.out.println(p);
////        System.out.println(p.getName());
//
//    }

//    public static void main(String[] args) {
//        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
//        Person person = context.getBean(Person.class);
//        Parrot parrot = context.getBean(Parrot.class);
//        System.out.println("Parrot's name: " + parrot.getName());
//        System.out.println("Person's parrot: " + person.getParrot());
//    }

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext
                (ProjectConfig.class);
        Person p = context.getBean(Person.class);
        System.out.println("Person's name: " + p.getName());
        System.out.println("Person's parrot: " + p.getParrot());
    }
}
