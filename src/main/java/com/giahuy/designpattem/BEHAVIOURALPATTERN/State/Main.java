package main.java.com.giahuy.designpattem.BEHAVIOURALPATTERN.State;

public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new MediaPlayer();

        player.play();   // PausedState → PlayingState
        player.play();   // đã playing → không làm gì
        player.pause();  // PlayingState → PausedState
        player.pause();  // đã paused   → không làm gì
        player.play();   // PausedState → PlayingState
    }
}
