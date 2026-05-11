package main.java.com.giahuy.designpattem.BEHAVIOURALPATTERN.Observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Connection {
    private String name;
    private String status;
    private final PropertyChangeSupport support
            = new PropertyChangeSupport(this);

    public Connection(String name) { this.name = name; }

    public void addObserver(PropertyChangeListener l) {
        support.addPropertyChangeListener(l);
    }

    public void setStatus(String newStatus) {
        String old = this.status;
        this.status = newStatus;
        support.firePropertyChange("status", old, newStatus);
    }

    public String getName() { return name; }
}
