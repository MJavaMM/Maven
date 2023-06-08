package Tea;

public class MyThread6  implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            if(i==5){
                System.out.println("礼让....");
                Thread.yield();//线程的礼让，但是不是一定会让
            }
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }

    public static void main(String[] args) {
        Thread t1 =new Thread(new MyThread6(),"AA");
        Thread t2 =new Thread(new MyThread6(),"BB");
        t1.start();
        t2.start();
    }
}
