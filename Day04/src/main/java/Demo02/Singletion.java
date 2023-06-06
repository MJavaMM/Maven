package Demo02;

public class Singletion {
    private Singletion(){}    //构造方法私有化，只允许在本内中创建对象

    //恶汉式
    private static Singletion singletion = new Singletion();
    public static Singletion getSingletion(){
        return singletion;
    }

    //懒汉式
    /*private  static Singletion singletion=null;
    public static Singletion getSingletion(){
        if (singletion==null){
            singletion= new Singletion();
        }
         return singletion;

    }*/
}
