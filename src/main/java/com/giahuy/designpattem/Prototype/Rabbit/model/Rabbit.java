package main.java.com.giahuy.designpattem.Creational_pattern_ex5.Rabbit.model;

import main.java.com.giahuy.designpattem.Creational_pattern_ex5.prototype.Prototype;

public class Rabbit implements Prototype, Cloneable {

    private int age;
    private Person owner;
        //tạo rabbit gốc
    public Rabbit(int age, Person owner) {
        this.age = age;
        this.owner = owner;
    }


    @Override
    public Rabbit clone() {
        //gọi clone, chuyển vào method
        try {
            //copy object
            Rabbit clone = (Rabbit) super.clone();
            //deep copy
            clone.owner = new Person(owner);
            return clone;

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
    public String toString() {
        return "Rabbit{" +
                "age=" + age +
                ", owner+" + owner.getName() +
                '}';
    }
}