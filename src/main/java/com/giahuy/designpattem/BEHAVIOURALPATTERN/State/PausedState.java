package main.java.com.giahuy.designpattem.BEHAVIOURALPATTERN.State;

public class PausedState implements State {
    @Override
    public void play(MediaPlayer mp) {
        //nếu đang pause mà play(), chuyển sáng playingstate
        mp.setState(new PlayingState());
        mp.setIcon("▶");
        System.out.println("Bắt đầu phát " + mp.getIcon());
    }

    @Override
    public void pause(MediaPlayer mp) {
        System.out.println("Đã tạm dừng rồi, không làm gì.");
    }
}