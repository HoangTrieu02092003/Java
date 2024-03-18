package behavioral.stratery.duck;

public abstract class Duck {
    IFlyBehavior flyBehavior;
    IQuackBehavior quackBehavior;
    void performQuack(){
        System.out.println(quackBehavior.quack());
    }
    void performFly(){
        System.out.println(flyBehavior.fly());
    }
    void swim(){
        System.out.println("Vịt nào cũng biết bơi");
    }
    public void setFlyBehavior(IFlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(IQuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void display();
}
