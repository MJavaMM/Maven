package tea;

import java.util.Random;

public class TestDong {

    public static Object getInstance(String path) throws Exception {
        Class aClass = Class.forName(path);
        return  aClass.newInstance();
    }

    public static void main(String[] args) {

        for (int i=0;i<10;i++){
            String path="";
            int num=new Random().nextInt(3);
            switch (num){
                case 0:
                    path="java.lang.Object";
                    break;
                case 1:
                    path="java.util.Date";
                    break;
                case 2:
                    path="com.njzhenghou.reflection.Person";
                    break;
            }


            try {
                Object instance = TestDong.getInstance(path);
                System.out.println(instance);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }





}
