package Demo01;

public class MyThread4 implements Runnable{

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

    public static void main(String[] args) {
        Thread t1 = new Thread(new MyThread4(),"AA");
        Thread t2 = new Thread(new MyThread4(),"BB");
        System.out.println(t1.getPriority());   //设置获取CPU资源的优先级
        System.out.println(t2.getPriority());
        t1.setPriority(3);
        t2.setPriority(10);
        System.out.println("========================");
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.start();
        t2.start();

    }
}
