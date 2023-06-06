package Tea;

public class Demo6 {
    public static void main(String[] args) {
        String str="abcdefg";
        StringBuffer sb = new StringBuffer(str);
        String s = sb.toString();
        System.out.println(s);
        System.out.println("----");
        //在字符串后面追加某个内容
        sb.append("tttt");
        System.out.println(sb);
        //insert(1,",")
        //从后向前 每隔3个字符插入一个逗号
        System.out.println("-----------");
        for (int i = sb.length()-3; i >0 ; i-=3) {
            sb.insert(i,",");
        }
        System.out.println(sb);

    }
}
