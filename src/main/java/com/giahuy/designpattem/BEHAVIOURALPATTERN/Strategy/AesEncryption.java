package main.java.com.giahuy.designpattem.BEHAVIOURALPATTERN.Strategy;

public class AesEncryption implements EncryptionStrategy {
    @Override
    public String encrypt(String data) {
        System.out.println("Applying Advanced Encryption Standard (AES)...");
        return "AES_ENCRYPTED_[" + data + "]";
    }
}
