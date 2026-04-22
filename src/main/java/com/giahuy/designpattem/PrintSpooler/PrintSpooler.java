package main.java.com.giahuy.designpattem.Creational_pattern_ex1.PrintSpooler.PrintSpooler;

public class PrintSpooler {
	// biến static lưu instance duy nhất
    private static PrintSpooler instance;

    // constructor private để không cho tạo đối tượng từ bên ngoài
    private PrintSpooler() {
        init();
    }

    // phương thức khởi tạo
    private void init() {
        System.out.println("Khoi tao Print Spooler...");
    }

    // lấy instance duy nhất (Singleton)
    public static synchronized PrintSpooler getInstance() {
        if (instance == null) {
            instance = new PrintSpooler();
        }
        return instance;
    }

    // phương thức in
    public void print() {
        System.out.println("Dang in tai lieu...");
    }
}
