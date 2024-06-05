package observer.CA1;

import java.util.List;

public class MainMyStream {
    public static void main(String[] args) {
        MyStream<List<MonHoc>> stream = new MyStream<>();
        DataAcces dataAcces = new DataAcces(stream);
        MyClient client = new MyClient(stream);
        System.out.println("Lan 1");
        dataAcces.themMonHoc(new MonHoc("CSDL","12",3));
    }
}
