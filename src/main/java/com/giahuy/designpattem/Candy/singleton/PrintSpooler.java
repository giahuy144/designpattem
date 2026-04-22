package main.java.com.giahuy.designpattem.Creational_pattern_ex2.Candy.Candy.singleton;

public class PrintSpooler {
    private static PrintSpooler instance;

        private PrintSpooler() { }

        public static PrintSpooler getInstance() {
            if (instance == null) {
                instance = new PrintSpooler();
            }
            return instance;
        }
}
