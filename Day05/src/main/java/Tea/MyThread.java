package Tea;

public class MyThread {
    public static void main(String[] args) {
        //获取线程对象
        Thread thread = Thread.currentThread();
        //获取线程的名称
        System.out.println(thread.getName());
        thread.setName("主线程");
        System.out.println(thread.getName());
    }
}
