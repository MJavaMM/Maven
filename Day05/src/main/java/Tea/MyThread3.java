package Tea;

/*线程的状态描述*/
public class MyThread3  implements  Runnable
{
    @Override
    public void run() {
            try{
                System.out.println("运行....");
                int result=10/0;
                System.out.println("继续运行..");

            }catch (Exception e){
                System.out.println("中断....");
                e.printStackTrace();
            }
    }

    public static void main(String[] args) {
        MyThread3 myThread3 = new MyThread3();
        Thread thread = new Thread(myThread3);
        System.out.println("线程创建....");
        System.out.println("就绪.....");
        thread.start();

    }
}
