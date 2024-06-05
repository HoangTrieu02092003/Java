package observer.CA1;

import java.util.List;

public class MyClient implements MyListener<List<MonHoc>>{
    MyStream<List<MonHoc>> myStream;

    public MyClient(MyStream<List<MonHoc>> myStream) {
        this.myStream = myStream;
        myStream.addListener(this);
    }

    @Override
    public void listen(List<MonHoc> monHocs) {
        for (MonHoc monHoc: monHocs)
            System.out.println(monHoc.toString());
    }
}
