package Demo01;

import Tea.WindowsDemo;

public class WindowDemo implements Runnable{
    @Override
    public void run() {
        while(true){
            synchronized (this){
        if(ticket>0){
            try {
                Thread.sleep(500);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"卖出了第"+ticket+"张票");
            ticket--;
        }else {
            break;
        }
        }
        }
    }
        public static int ticket=100;

    public static void main(String[] args) {
        WindowDemo wd = new WindowDemo();
        Thread t1 = new Thread(wd,"窗口一");
        Thread t2 = new Thread(wd,"窗口二");
        Thread t3 = new Thread(wd,"窗口三");
        t1.start();
        t2.start();
        t3.start();
    }


}
