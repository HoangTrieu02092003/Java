package singleton.vidu;

public class MainSingleton {
    public static void main(String[] args){
        MySingleton s1 = MySingleton.getInstance();
        MySingleton s2 = MySingleton.getInstance();
        s1.inCout();
        s1.inCout();
        s2.inCout();
        s2.inCout();
    }
}
