package ex5;

public class Cau {
    public void method1(){
        int sum=0;
        int count=0;
        while(count<=100){
            if(count%2==0){
                sum+=count;
            }
            count++;
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
        Cau cau = new Cau();
        cau.method1();
    }
}
