package ex1;

public class ex1 {
        public void ageshow(int age){
            if(age<6&&age>0){
                System.out.println("儿童");
            }else if (age>6&&age<13){
                System.out.println("少儿");
            }else if(age>14&&age>17){
                System.out.println("青少年");
            }else if(age>18&&age<35){
                System.out.println("青年");
            }else if(age>36&&age<50){
                System.out.println("中年");
            }else if(age>50){
                System.out.println("中老年");
            }else{
                System.out.println("年龄输入有误！");
            }
        }

    public static void main(String[] args) {
        ex1 ex1 = new ex1();
        ex1.ageshow(18);
    }

}

