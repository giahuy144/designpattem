package main.java.com.giahuy.designpattem.smartoffice.device;

public enum ProjectorMode {
    WORK("Working mode - High brightness"),
    MOVIE("Movie mode - Low brightness, high contrast"),
    OFF("Off");

    private String description;

    ProjectorMode(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}