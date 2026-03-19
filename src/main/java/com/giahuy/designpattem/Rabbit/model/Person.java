package main.java.com.giahuy.designpattem.Rabbit.model;

public class Person {

    private String name;
        //tạo person
    public Person(String name) {
        this.name = name;
    }

    public Person(Person other) {
        this.name = other.name;
    }
}