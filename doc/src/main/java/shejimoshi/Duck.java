package shejimoshi;

public abstract class Duck {
    FlyBehavior ﬂyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        ﬂyBehavior.ﬂy();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks ﬂoat, even decoys!");
    }
}