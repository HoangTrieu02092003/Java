package observer.CA4;

import java.util.ArrayList;
import java.util.List;

public class Topic implements TopicListener{
    List<TinTuc> list = new ArrayList<>();
    List<TopicListener> listeners = new ArrayList<>();
    @Override
    public void listen(TinTuc t) {
        System.out.println("Topic nhan duoc tin: " + t);
    }

    public void dangKy(TopicListener listener){
        listeners.add(listener);
    }

    public void huyDangKy(TopicListener listener){
        listeners.remove(listener);
    }

    public void themMoi(TinTuc t){
        this.list.add(t);
        for (TopicListener listener: listeners)
            listener.listen(t);
    }

    public void capNhat(TinTuc t){
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getId() == t.getId()){
                list.set(i, t);
                for (TopicListener listener: listeners)
                    listener.listen(t);
                return;
            }
        }
    }
}
