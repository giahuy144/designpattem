package main.java.com.giahuy.designpattem.BEHAVIOURALPATTERN.Observer;

public class Main {
    public static void main(String[] args) {
        Connection alice = new Connection("Alice");
        Connection bob   = new Connection("Bob");

        SocialMediaFeed myFeed = new SocialMediaFeed("Tôi");

        // Đăng ký theo dõi
        alice.addObserver(myFeed);
        bob.addObserver(myFeed);

        alice.setStatus("Đang ăn phở!");
        bob.setStatus("Xem phim tối nay không?");
        alice.setStatus("Về nhà rồi.");
    }
}