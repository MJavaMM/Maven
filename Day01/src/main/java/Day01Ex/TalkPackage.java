package Day01Ex;

public class TalkPackage extends ServicePackage implements CallService,SendService{
    public int  talkTime;
    public int smsCount;
    //public double price;    继承父类中的属性
    public void showInfo(){}   //重写父类中的方法

    @Override
    public int call(int minCout, MobileCard card) {
        return 0;
    }

    @Override
    public int send(int count, MobileCard card) {
        return 0;
    }
}
