package singleton.vidu;

public class MySingleton {
    public static MySingleton getInstance() {
        if(instance == null)
            instance = new MySingleton();
        return instance;
    }
    private static MySingleton instance;
    int cout = 0;
    public void inCout(){
        System.out.println(++cout);
    }
}
