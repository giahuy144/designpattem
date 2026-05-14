package main.java.com.giahuy.designpattem.BEHAVIOURALPATTERN.Observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class SocialMediaFeed implements PropertyChangeListener {
    //implement bắt buộc phải có propertychange
    //propertychange hàm này tự động chạy khi subject thay đổi
    private String owner;
    private List<String> statuses = new ArrayList<>();

    public SocialMediaFeed(String owner) {
        this.owner = owner;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        //lấy ra object đã thay đổi
        Connection c = (Connection) evt.getSource();
        //tạo message
        String msg = c.getName()  + evt.getNewValue() ;
        //lưu vào feed
        statuses.add(msg);
        //in ra màn hình
        System.out.println("[Feed " + owner + "] " + msg);
    }

    public List<String> getStatuses() { return statuses; }
}