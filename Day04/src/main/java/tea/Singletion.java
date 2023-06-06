package tea;


/**   单例设计模式：
*       懒汉式：
*
*       饿汉式：
*
* */
public class Singletion {
    //将构造方法私有化，只能在本类中可以创建对象
    private Singletion(){}

    //饿汉式：一上来就创建对象
    /*private  static  Singletion singletion= new Singletion();
    public  static  Singletion getSingletion(){
        return singletion;
    }*/
    //懒汉式：什么时候需要什么时候才创建

    private  static  Singletion singletion=null;
    public static Singletion getSingletion(){
        if (singletion==null){
            singletion= new Singletion();
        }
        return  singletion;
    }
}
