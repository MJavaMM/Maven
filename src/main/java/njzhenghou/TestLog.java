package njzhenghou;

import org.apache.log4j.Logger;

import java.util.Scanner;

public class TestLog {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Logger logger = Logger.getLogger(TestLog.class.getName());
        System.out.print("请输入被除数：");
        int  n1=sc.nextInt();
        logger.debug("被除数是："+n1);
        System.out.print("请输入除数");
        int n2=sc.nextInt();
        logger.debug("除数是："+n2);
        int  result=n1/n2;
        System.out.println("商是："+result);
        logger.debug("商是："+result);
    }
}
