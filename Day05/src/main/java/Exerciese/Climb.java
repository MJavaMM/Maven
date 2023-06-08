package Exerciese;

public class Climb extends Thread{

    int time;   //爬山需要的时间
    int num;  //爬到的第几个100米

    public Climb() {
    }

    public Climb(String name, int time, int kile) {
        super(name);
        this.time=time;
        this.num=kile*1000 /100;
    }


    @Override
    public void run() {
        while(num>0){
            try {
                Thread.sleep(this.time);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"爬完100米");
            num--;
        }
        System.out.println(Thread.currentThread().getName()+"到达终点");
    }

    public static void main(String[] args) {
        Climb old = new Climb("老年人",1500,1);
        Climb young = new Climb("青年人",1000,1);
        old.start();
        young.start();
    }
}
