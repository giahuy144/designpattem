package main.java.com.giahuy.designpattem.BEHAVIOURALPATTERN.Observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class SocialMediaFeed implements PropertyChangeListener {
    //định nghĩa quan hệ 1 chiều
    //khi object thay đổi trạng thái, các object phụ thuộc sẽ tự động được thông báo
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