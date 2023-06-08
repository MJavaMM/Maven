package Demo01;

public class MyThread5 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }


    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread5(),"CC");
        thread.start();
        for (int i = 0; i <20 ; i++) {
            if(i==5){
                try {
                    thread.join();  //线程强制执行
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"运行："+i);
        }
    }
}
