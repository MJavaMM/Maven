package ex6;

public class Reg {
    public void print(){
     for (int i=1; i<=5; i++){
        for (int j=1; j<=5-i; j++){
            System.out.print(" ");
        }
        for (int j=1; j<=2*i-1; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }

    public static void main(String[] args) {
        Reg reg = new Reg();
        reg.print();
    }
}
