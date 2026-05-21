package main.java.com.giahuy.designpattem.BEHAVIOURALPATTERN.TemplateMethod;

public abstract class PizzaRecipe {

    //định nghĩa sẳn khung xử lý thuật toán trong class cha
    //các bước cụ thể sẽ được class con cài đặt
    public final void makePizza() {
        System.out.println("--- Starting new pizza order ---");
        makeDough();
        addSauce();
        addToppings();
        bake();
        System.out.println("Pizza is ready!\n");
    }

    // Common Step: Every pizza gets the same dough
    private void makeDough() {
        System.out.println("Rolling out the standard pizza dough.");
    }

    // Common Step: Every pizza bakes exactly the same way
    private void bake() {
        System.out.println("Baking at 400°C for 15 minutes.");
    }

    protected abstract void addSauce();
    protected abstract void addToppings();
}