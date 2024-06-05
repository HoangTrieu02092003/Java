package observer.CA4;

public class ThanhVienA implements TopicListener{
    Topic topic;

    public ThanhVienA(Topic topic) {
        this.topic = topic;
        this.topic.dangKy(this);
    }

    @Override
    public void listen(TinTuc t) {
        System.out.println("Thanh vien A nhan duoc tin: " + t);
    }
}
