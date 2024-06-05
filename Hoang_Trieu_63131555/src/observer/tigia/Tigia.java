package observer.tigia;

import java.util.ArrayList;
import java.util.List;

public abstract class Tigia {
    List<TigiaObserver> observers = new ArrayList<TigiaObserver>();

    public void attach(TigiaObserver observer) {
        observers.add(observer);
    }

    public void detach(TigiaObserver observer) {
        observers.remove(observer);
    }
    abstract public void notify(double delta);

    public static interface TigiaObserver {
        public void tigiaChanged(double delta);
    }
}
