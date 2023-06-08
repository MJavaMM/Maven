package Exerciese;

public class Hospital implements Runnable{

    public static  int sur=1;

    @Override
    public void run() {
        while(true){
            if(sur<=10)
            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+sur+"号病人在看病");
                sur++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }else{
                break;
            }
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Hospital hospital = new Hospital();
        Thread sur = new Thread(hospital,"特需号：");
        sur.setPriority(10);
        sur.start();
        for (int i = 0; i <50 ; i++) {
            Thread.sleep(500);
            if(i==10){
                sur.join();
            }
            System.out.println("普通号:"+(i+1)+"号病人正在看病");
        }

    }
}
