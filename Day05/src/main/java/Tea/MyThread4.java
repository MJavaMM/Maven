package Tea;

public class MyThread4  implements   Runnable{
    @Override
    public void run() {
        for (int i = 0; i <50 ; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }

    /*设置线程执行的级别  1-10*/
    public static void main(String[] args) {
        Thread t1=new Thread(new MyThread4(), "AA");
        Thread t2=new Thread(new MyThread4(), "BB");
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.setPriority(1);
        t2.setPriority(10);
        System.out.println("------------------");
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
       t1.start();
        t2.start();

    }
}
