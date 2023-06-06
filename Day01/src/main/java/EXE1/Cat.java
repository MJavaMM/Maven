package EXE1;

import ExE.Pet;

public class Cat extends Pet {
    public static void main(String[] args) {
        Cat cat= new Cat();
        cat.name="喵喵";      //public访问成功
       // cat.id=121;          //private访问失败
       // cat.card=11;         //default访问失败
        cat.address="喵喵屋";      //protected访问成功
    }
}
