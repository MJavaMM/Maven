package Ex2;

import java.util.Scanner;

public class Register {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入邮箱");
        String count =sc.next();
        int f = 0;
        int flag1 = count.lastIndexOf(".");
        if(count.indexOf("@")==-1||count.indexOf(".")==-1||count.indexOf("@")>count.indexOf(".")){
            System.out.println("邮箱格式错误");
        }else if(!count.substring(flag1).equals(".com")){
            System.out.println("邮箱格式错误");
        }else{
            System.out.println("邮箱格式正确");
            f++;
        }

        System.out.println("请输入java文件名");
        String name =sc.next();
        int flag2 = count.lastIndexOf(".");
        if(name.indexOf(".")==-1){
            System.out.println("文件格式错误");
        }else if(!name.substring(flag2).equals(".java")){
            System.out.println("文件格式错误");
        }else{
            System.out.println("文件格式正确");
            f++;
        }
        if(f==2){
            System.out.println("提交成功");
        }

    }
}
