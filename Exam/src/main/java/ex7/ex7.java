package ex7;

import java.util.Scanner;

public class ex7 {
    static Scanner sc = new Scanner(System.in);
    public void search(int arr[],int a,int b,int num){
        for (int i = a; i <=b; i++) {
            if (arr[i]==num){
                System.out.println("您需要查找的数字"+num+"的下标为"+i);
                return;
            }

            }
        System.out.println(num+"不存在");
        }



    public static void main(String[] args) {
        ex7 ex7 = new ex7();
        int [] arr = new int[7];
        for (int i = 0; i <7; i++) {    //用数组arr【】接受七个值
            System.out.print("请输入第"+(i+1)+"个值：");
            arr[i]=sc.nextInt();
        }
        ex7.search(arr,0,6,4);

    }
}
