package observer.CA4;

public class TinTuc {
    private String content;
    String id;

    public TinTuc(String content, String id) {
        this.content = content;
        this.id = id;
    }

    @Override
    public String toString() {
        return content;
    }

    public String getContent() {
        return content;
    }

    public String getId() {
        return id;
    }
}
