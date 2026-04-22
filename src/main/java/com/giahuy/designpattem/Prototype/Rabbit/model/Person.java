package main.java.com.giahuy.designpattem.Creational_pattern_ex5.Rabbit.model;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person(Person other) {
        this.name = other.name;
    }

    public String getName() {
        return name;
    }
}