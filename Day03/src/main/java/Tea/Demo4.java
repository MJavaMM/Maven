package Tea;

/*
* public int indexOf(int ch)   第一次出现的位置下标,如果查找的内容不存在则返回-1
public int indexOf(String value)
public int lastIndexOf(int ch)
public int lastIndexOf(String value)  查找最后一个位置的内容
public String substring(int index)    截取当前位置到最后的内容
public String substring(int beginindex, int endindex)   截取制定区间的内容
public String trim()   截取前后空格内容
* */
public class Demo4 {
    public static void main(String[] args) {
        String str="abcdefgabc";
        System.out.println(str.indexOf("k"));
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.substring(3));
        System.out.println(str.substring(3,7));
        System.out.println(str.trim());

    }
}
