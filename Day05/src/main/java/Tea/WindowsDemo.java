package Tea;
/*模拟窗口吗，卖票   共有100张票开始卖*/
public class WindowsDemo  implements  Runnable{
    //票的总数
    static int ticket=100;
    boolean flag=true;

   /*
    public void run() {

        while(true){
            synchronized (this) {    //上锁
                if (ticket > 0) {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "号窗口卖出了第 " + ticket + "张票");
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }*/
    @Override
    public  void  run() {
        flag=true;
        while(flag){
            sale();
            }

    }

    public synchronized void sale(){
        if (ticket > 0) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "号窗口卖出了第 " + ticket + "张票");
            ticket--;
        } else {
            flag=false;
        }
    }
    public static void main(String[] args) {
        WindowsDemo wd= new WindowsDemo();
        Thread t1 = new Thread(wd,"窗口1");
        Thread t2 = new Thread(wd,"窗口2");
        Thread t3 = new Thread(wd,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
