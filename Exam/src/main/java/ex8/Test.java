package ex8;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("花","波斯猫");
        Dog dog = new Dog("黑","藏獒");
        cat.eat();
        cat.catchMouse();
        dog.eat();
        dog.lookHome();
    }
}
