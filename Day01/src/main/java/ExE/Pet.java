package ExE;

public class Pet {
    public String name;
    public int age;
    private int id;
    int card;
    protected String address;
    public void feed(){
        System.out.println("喂食中...");
    }
}

class Dog extends Pet{
    public static void main(String[] args) {
    Dog dog = new Dog();
    dog.name="旺财";
    dog.card=11;
    dog.address="旺旺屋";
    }
}
