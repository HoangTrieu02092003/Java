package observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class ThanhVienB implements TopicListener{
    List<TinTuc> list = new ArrayList<>();
    Topic topic;

    public ThanhVienB( Topic topic) {
        this.topic = topic;
        this.topic.dangKy(this);
    }

    @Override
    public void listen(TinTuc t) {
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == t.getId()){
                list.set(i, t);
                System.out.println(t.toString());
                return;
            }
        }
        list.add(t);
        System.out.println("Thanh vien B nhan duoc tin: " + t.toString());
    }

    public List<TinTuc> getList() {
        return list;
    }
}
