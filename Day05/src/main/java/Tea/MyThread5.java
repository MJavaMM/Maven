package Tea;

public class MyThread5  implements  Runnable
{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getPriority()+":"+i);
        }
    }

    public static void main(String[] args) {
        Thread t =new Thread(new MyThread5(),"AA" );

        t.start();
        for (int i = 0; i <20 ; i++) {
            if(i==5){
                try {
                    /*线程的强制执行*/
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName()+"运行："+i);
        }
    }
}
