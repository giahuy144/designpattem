package main.java.com.giahuy.designpattem.Rabbit.model;

import main.java.com.giahuy.designpattem.Rabbit.prototype.Prototype;

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