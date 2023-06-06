package Demo01;

public class Demo03 {
    public static void main(String[] args) {


    String s1="abcdE";
    String s2="ABCDe";

    String str1 = new String("tom");
    String str2 = new String("tom");

        System.out.println(str1.equals(str2));
        str1.equalsIgnoreCase(s2);
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.toUpperCase());
        s1.toUpperCase();
        System.out.println(s1.toLowerCase());
        s1.toLowerCase();
}
}