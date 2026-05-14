package main.java.com.giahuy.designpattem.BEHAVIOURALPATTERN.Observer;

public class Main {
    public static void main(String[] args) {
        //tạo user
        Connection alice = new Connection("Alice");
        Connection bob   = new Connection("Bob");
        //tạo object
        SocialMediaFeed myFeed = new SocialMediaFeed("Tôi");

        // Đăng ký theo dõi
        alice.addObserver(myFeed);
        bob.addObserver(myFeed);

        //alice đổi status
        alice.setStatus("Đang ăn phở!");
        bob.setStatus("Xem phim tối nay không?");
        alice.setStatus("Về nhà rồi.");
    }
}