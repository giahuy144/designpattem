package main.java.com.giahuy.designpattem.BEHAVIOURALPATTERN.Strategy;

public class FileEncryptor {
    //là định nghĩa nhiều thuật toán và cho phép thay đổi thuật toán lúc runtime
    private EncryptionStrategy strategy;

    public FileEncryptor(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public void processFile(String fileName, String data) {
        System.out.println("\nProcessing file: " + fileName);
        String encryptedData = strategy.encrypt(data);
        System.out.println("Result: " + encryptedData);
    }
}