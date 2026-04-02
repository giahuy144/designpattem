package main.java.com.giahuy.designpattem.Creational_pattern_ex1.PrintSpooler.PrintSpooler;

public class Main {
	public static void main(String[] args) {

        PrintSpooler p1 = PrintSpooler.getInstance();
        PrintSpooler p2 = PrintSpooler.getInstance();

        p1.print();

        if (p1 == p2) {
            System.out.println("Chi co mot instance duy nhat");
        }
    }
}
