package Tea;

public class Demo3 {

    public static void main(String[] args) {
        String s1="abcdE";
        String s2="ABCDe";
        String s3="ABCDe";

        String str1 = new String("tom");
        String str2 = new String("tom");

        //String 类中重写了equals()方法比较的是内容
        System.out.println(str1.equals(str2));
        /*忽略大小比较是否相同*/
        System.out.println(s1.equalsIgnoreCase(s2));
        //转换为大写
        System.out.println(s1.toUpperCase());
        //转换为小写
        System.out.println(s1.toLowerCase());




    }

}
