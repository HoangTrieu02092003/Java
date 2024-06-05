package observer.CA1;

import java.util.ArrayList;
import java.util.List;

public class DataAcces {
    List<MonHoc> monHocs = new ArrayList<>();
    MyStream<List<MonHoc>> stream;

    public DataAcces(MyStream<List<MonHoc>> stream) {
        this.stream = stream;
    }

    public void themMonHoc(MonHoc monHoc) {
        monHocs.add(monHoc);
        stream.addEvent(monHocs);
    }

//    public void xoaMonHoc(MonHoc monHoc) {
//        MonHoc m = null;
//        for (MonHoc mh: monHocs)
//            if(mh.maMH )
//    }
}
