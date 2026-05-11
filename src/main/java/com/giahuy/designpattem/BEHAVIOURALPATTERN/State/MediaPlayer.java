package main.java.com.giahuy.designpattem.BEHAVIOURALPATTERN.State;

public class MediaPlayer {
    private State state;
    private String icon;

    public MediaPlayer() {
        // Bắt đầu ở trạng thái Paused
        this.state = new PausedState();
        this.icon  = "⏸";
    }

    public void setState(State state) { this.state = state; }
    public void setIcon(String icon)  { this.icon  = icon; }
    public String getIcon()           { return icon; }

    public void play()  { state.play(this); }
    public void pause() { state.pause(this); }
}
