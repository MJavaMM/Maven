package ex4;

import sun.security.provider.Sun;

public class Sum {
    public void sum(int num){
        int num1 =num%10;   //得到个位上的数
        int num2=num/100;    //得到百位上的数
        int num3=num/10%10;  //得到十位上的数
        System.out.println("各数字之和为："+(num1+num2+num3));


    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.sum(123);

    }

}
