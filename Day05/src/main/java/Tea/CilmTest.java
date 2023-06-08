package Tea;

public class CilmTest extends Thread{
    int time; //爬山需要的时间
    int num=0; //爬到的第几个100米

    public CilmTest(String name,int time,int kile){
        super(name);
        this.time=time;
        this.num=kile*1000 /100;
    }

    @Override
    public void run() {
            while (num>0){
                try {
                    Thread.sleep(this.time);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"爬完100米");
                num--;


            }
        System.out.println(Thread.currentThread().getName()+"到达终点");

    }

    public static void main(String[] args) {
        CilmTest oldMan = new CilmTest("老年人",1500,1);
        CilmTest yongMan = new CilmTest("----年轻人",1000,1);
        oldMan.start();
        yongMan.start();
    }
}
