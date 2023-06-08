package ex9;

import java.util.Scanner;

public class Times {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("请输入一串字符串：");
        String str =sc.next();
        int count=0;    //统计次数
        System.out.print("请输入需要查询字符：");
        String ch=sc.next();
        for (int i = 0; i < str.length()-1; i++) {
            String st = str.substring(i,i+1);        //一个一个的遍历字符串
            if(st.equals(ch)){
                count++;
            }

        }
        System.out.println(ch+"出现的次数是："+count);
    }
}
