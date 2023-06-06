package Day01Ex;

import javax.rmi.CORBA.Util;
import javax.smartcardio.Card;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SosoPhone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CardUtil util = new CardUtil();
        util.init();
        boolean flag =true;
        do {
        System.out.println("*****************欢迎使用嗖嗖移动业务大厅*****************");
        System.out.println("1.用户登录  2.用户注册  3.使用嗖嗖  4.话费充值  5.资费说明  6.退出系统");
        System.out.print("请选择：");
        int choose = sc.nextInt();
        switch (choose){
            case 1:
                System.out.println("用户登录");
                System.out.print("请输入手机号：");
                String moblieNum = sc.next();
                System.out.print("请输入密码：");
                String passward = sc.next();
                if(util.Login(moblieNum,passward)){
                    System.out.println("登录成功");
                }else{
                    System.out.println("登录失败");
                }
                break;
            case 2:
                System.out.println("用户注册");
                CardUtil.Register();
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                flag=false;
                break;
        }

    }while(flag);
}
}
