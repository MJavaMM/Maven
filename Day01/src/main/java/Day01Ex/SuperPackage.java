package Day01Ex;

public class SuperPackage extends ServicePackage implements CallService,SendService,NetService{
    public int talkTime=200;
    public int smsCount=50;
    public int flow=1;
    //public double price;  继承父类中的方法
    public void showInfo(){}   //重写父类中的方法

    @Override
    public int call(int minCout, MobileCard card) {
        return 0;
    }

    @Override
    public int netPlay(int flow, MobileCard card) {
        return 0;
    }

    @Override
    public int send(int count, MobileCard card) {
        return 0;
    }
}
