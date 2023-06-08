package Demo01;

public class MyThread6 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <30 ; i++) {
            if(i==5){
                System.out.println("礼让");
                Thread.yield();
            }
            System.out.println(Thread.currentThread().getName()+":"+i);
        }

    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread6(),"AA");
        Thread t2 = new Thread(new MyThread6(),"BB");
        t1.start();
        t2.start();

    }


}
