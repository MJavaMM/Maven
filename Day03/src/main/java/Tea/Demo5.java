package Tea;

import java.util.Scanner;

public class Demo5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入文件名：");
        String javaName=scanner.next();
        System.out.println("请输入邮箱名：");
        String emailName=scanner.next();
        //hhh.java
        boolean  nameFlag=false;
        if(javaName.indexOf(".")!=-1 && javaName.substring(javaName.lastIndexOf(".")).equals(".java")){
            nameFlag=true;

        }
        boolean emailFlag=false;
        // 111@qq.com
        if(emailName.indexOf("@") !=-1 && emailName.indexOf(".")!=-1 && emailName.indexOf(".")>emailName.indexOf("@") ){
            emailFlag=true;
        }

        if(nameFlag && emailFlag){
            System.out.println("作业提交成功");
        }else{
            System.out.println("提交失败");
        }

    }
}
