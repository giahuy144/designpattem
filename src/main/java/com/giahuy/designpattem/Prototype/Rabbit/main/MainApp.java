package main.java.com.giahuy.designpattem.Prototype.Rabbit.main;


import main.java.com.giahuy.designpattem.Prototype.Rabbit.model.Person;
import main.java.com.giahuy.designpattem.Prototype.Rabbit.model.Rabbit;

public class MainApp {

    public static void main(String[] args) {

        Person p = new Person("John");

        Rabbit rabbit1 = new Rabbit(2, p);

        Rabbit rabbit2 = rabbit1.clone();

        System.out.println(rabbit1);
        System.out.println(rabbit2);
    }
}