package Day01Ex;

import com.sun.javaws.IconUtil;

import javax.swing.plaf.IconUIResource;
import java.util.*;

public class CardUtil {
    static Scanner sc = new Scanner(System.in);
    static Map<String,MobileCard> cards = new HashMap<>();

    public Map<String, List<ConsumInfo>> consumInfos;



    public void initScene(){}
    public boolean isExistCard(String number,String passward){
        return true;
    }

    public boolean isExistCard(String number){
        return true;
    }

    public String createNumber(){return " ";}

    public String[] getNewNumbers(int count){
        return new String[0];
    }

    public static void addCard(MobileCard card){  //将用户创建的卡对象存入map集合
        cards.put(card.getCardNumber(),card);
        System.out.println("注册成功");
    }

    public void delCard(String number){}

    public void showRemainDetail(String number){}

    public void showAmountDetail(String number){}

    public void addConsumInfo(String number,ConsumInfo info){}

    public void useSoso(String number){}

    public void showDescription(){}

    public void changingPack(String number,String packNum){}

    public void printConsumInfo(String number){}

    public void changeMoney(String number,double money){}

    public void  init(){   //初始化其中的一些数据
        MobileCard card1 = new MobileCard("13854787856","lisi","123",new TalkPackage(),50.0,20.0,12,20);
        MobileCard card2 = new MobileCard("13854787855","zhangsan","123",new TalkPackage(),50.0,20.0,12,20);
        MobileCard card3 = new MobileCard("13854787854","wangwu","123",new TalkPackage(),50.0,20.0,12,20);

        cards.put("13854787856",card1);
        cards.put("13854787855",card2);
        cards.put("13854787854",card3);
    }

    public  boolean Login(String num,String pwd){
        Set<String> strings = cards.keySet(); //讲cards里面的key全拿出来
        Iterator<String> it =strings.iterator();  //迭代器遍历
        while(it.hasNext()){
            String keyNum =it.next();
            if(keyNum.equals(num)&&cards.get(keyNum).getPassWord().equals(pwd)){
                return true;
            }
        }
        return false;
    }

    public static void Register() {  //注册卡对象的方法
        String [] newNumber = CardUtil.createNewNumber(9);   // 将createNewNumber方法生成的随机手机号放入数组中

        for (int i = 0; i < newNumber.length; i++) {    //将随机号码打印出来
            System.out.println((i+1)+"."+newNumber[i]);
        }

        System.out.print("请输入想选择的号码序号：");
        int chooseNum=sc.nextInt();
        String num=newNumber[chooseNum-1];    //用户所选择的号码

        /*选套餐*/
        System.out.println("1.话痨套餐  2.网虫套餐  3.超人套餐");
        System.out.print("请选择需要办理的套餐序号：");
        int choosePack = sc.nextInt();
        ServicePackage pack = CardUtil.createPack(choosePack);


        /*缴费*/
        System.out.print("请缴费：");
        double myMoney = sc.nextDouble();


        /*输入用户名和密码*/
        System.out.print("请输入用户名：");
        String name = sc.next();
        System.out.print("请输入密码：");
        String password = sc.next();

        /*将信息加入到map集合中*/
        MobileCard card = new MobileCard(num,name,password,pack,pack.getPrice(),myMoney,0,0);
        CardUtil.addCard(card);

    }

    private static ServicePackage createPack(int choosePack) {
        ServicePackage pack =null;
        switch (choosePack){
            case 1:
                pack=new TalkPackage();
                break;
            case 2:
                pack=new NetPackage();
                break;
            case 3:
                pack=new SuperPackage();
                break;
        }
        return pack;
    }

    private static String[] createNewNumber(int count) {    //注册中创建随机号码的方法
        String [] newNumbers = new String[count];
        for (int i = 0; i < newNumbers.length; i++) {
            newNumbers[i]=createNewNumberMethod();
        }
        return newNumbers;
    }

    private static String createNewNumberMethod() {      //生成随机号码方法
        boolean flag = false;
        Random random = new Random();
        String myNumber=null;
        int temp;
        do{
            do{
            temp = random.nextInt(100000000);   //创建八位随机数
        }while(temp<10000000);
        myNumber="139"+temp;

        Set<String> strings = cards.keySet();
        for (String key:strings) {
            if(myNumber.equals(key)){
                flag = true;
                break;
            }
        }
        }while(flag);
        return myNumber;
    }

}
