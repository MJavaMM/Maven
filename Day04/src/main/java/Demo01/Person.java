package Demo01;

public class Person {
    public int age;
    private String name;

    public Person() {
    }
    private Person(String name) {
        this.name = name;
    }


    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("这是一个show（）方法");
    }

    private String ShowNation(String nation){
        System.out.println("我的国籍是："+nation);
        return nation;
    }
}
