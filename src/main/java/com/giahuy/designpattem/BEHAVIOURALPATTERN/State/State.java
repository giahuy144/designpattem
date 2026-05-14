package main.java.com.giahuy.designpattem.BEHAVIOURALPATTERN.State;

public interface State {
    //Định nghĩa các hành vi theo trạng thái.
    //Mỗi state phải tự xử lý: play, pause
    void play(MediaPlayer mp);
    void pause(MediaPlayer mp);
}