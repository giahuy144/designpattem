package main.java.com.giahuy.designpattem.smartoffice.device;

public class Projector implements Device {
    private ProjectorMode mode;

    public Projector() {
        this.mode = ProjectorMode.OFF;
    }

    @Override
    public void turnOn() {
        setMode(ProjectorMode.WORK);
    }

    @Override
    public void turnOff() {
        setMode(ProjectorMode.OFF);
    }

    public void setMode(ProjectorMode mode) {
        this.mode = mode;
        System.out.println("Projector set to: " + mode.getDescription());
    }

    public ProjectorMode getMode() {
        return mode;
    }
}