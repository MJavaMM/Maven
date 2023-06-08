package Tea;

public class CureTest  implements  Runnable{
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            System.out.println("特需号 "+(i+1)+" 在看病");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new CureTest(),"普通号");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        for (int i = 0; i <20 ; i++) {
            System.out.println("普通号 "+(i+1)+" 在看病");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(i==9){
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
