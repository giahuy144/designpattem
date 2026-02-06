package main.java.com.giahuy.designpattem.Candy.singleton;

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
