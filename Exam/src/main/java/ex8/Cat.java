package ex8;

public class Cat {
    private String color;
    private String breed; //品种

    public void eat(){
        System.out.println(color+"色的"+breed+"正在吃鱼");
    }
    public void catchMouse(){
        System.out.println(color+"色的"+breed+"正在逮老鼠");
    }

    public Cat() {
    }

    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


}
