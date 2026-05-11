package main.java.com.giahuy.designpattem.BEHAVIOURALPATTERN.Strategy;

public class Main {
    public static void main(String[] args) {
        String secretData = "TopSecretPassword123";

        // Start with AES
        FileEncryptor app = new FileEncryptor(new AesEncryption());
        app.processFile("passwords.txt", secretData);

        // Dynamically switch to RSA
        app.setStrategy(new RSAEncryption());
        app.processFile("bank_details.txt", secretData);
    }
}