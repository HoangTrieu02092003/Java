package iterator.vidu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    static void duyetMonHocs(Iterator<MonHoc> iterator) {
        while (iterator.hasNext()) {
            MonHoc monHoc = iterator.next();
            System.out.println(monHoc.toString());
        }
    }

    public static void main(String[] args) {
        List<MonHoc> list = new ArrayList<>(Arrays.asList(
                new MonHoc("Java", 3),
                new MonHoc("C++", 4),
                new MonHoc("Python", 3),
                new MonHoc("C#", 3),
                new MonHoc("JavaScript", 3)
        ));
        duyetMonHocs(list.iterator());
    }
}


