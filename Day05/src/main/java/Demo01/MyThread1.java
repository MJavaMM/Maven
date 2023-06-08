package Demo01;

public class MyThread1 extends Thread{
    //重写run方法
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }

    public static void main(String[] args) {
        MyThread1 thread = new MyThread1();
        MyThread1 thread1 =new MyThread1();

        thread.start();
        thread1.run();
    }
}
