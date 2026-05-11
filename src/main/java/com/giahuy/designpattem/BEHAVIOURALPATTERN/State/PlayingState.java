package main.java.com.giahuy.designpattem.BEHAVIOURALPATTERN.State;

public class PlayingState implements State {
    @Override
    public void play(MediaPlayer mp) {
        System.out.println("Đã đang phát, không làm gì.");
    }

    @Override
    public void pause(MediaPlayer mp) {
        mp.setState(new PausedState());
        mp.setIcon("⏸");
        System.out.println("Tạm dừng " + mp.getIcon());
    }
}