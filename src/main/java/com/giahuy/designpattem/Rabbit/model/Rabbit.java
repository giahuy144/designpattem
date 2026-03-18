package main.java.com.giahuy.designpattem.Rabbit.model;

public class Rabbit implements Cloneable {

    private int age;
    private Person owner;

    public Rabbit(int age, Person owner) {
        this.age = age;
        this.owner = owner;
    }

    @Override
    public Rabbit clone() {

        try {
            Rabbit clone = (Rabbit) super.clone();
            clone.owner = new Person(owner);
            return clone;

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}