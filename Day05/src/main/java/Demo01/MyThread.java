package Demo01;

public class MyThread {
    public static void main(String[] args) {

        //获取线程对象
    Thread thread = Thread.currentThread();
    //获取线程的名称
        System.out.println(thread.getName());
        //改变线程名
        thread.setName("线程1");
        System.out.println(thread.getName());
    }
}