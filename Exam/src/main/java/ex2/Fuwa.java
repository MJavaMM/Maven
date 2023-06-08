package ex2;

import java.util.Scanner;

public class Fuwa {
    Scanner sc = new Scanner(System.in);
    public void show(int num){
        switch (num){
            case 1:
                System.out.println("贝贝");
                break;
            case 2:
                System.out.println("京京");
                break;
            case 3:
                System.out.println("欢欢");
                break;
            case 4:
                System.out.println("迎迎");
                break;
            case 5:
                System.out.println("宁宁");
                break;
            default:
                System.out.println("北京欢迎您");
                break;
        }
    }

    public static void main(String[] args) {
        Fuwa fuwa = new Fuwa();
        fuwa.show(65);
    }
}
