package observer.CA1;

import java.util.ArrayList;
import java.util.List;

public class MyStream <T>{
    List<MyListener> listeners = new ArrayList<>();

    public void addListener(MyListener listener) {
        listeners.add(listener);
    }

    public void addEvent(T t) {
        for (MyListener listener: listeners)
            listener.listen(t);
    }


}
