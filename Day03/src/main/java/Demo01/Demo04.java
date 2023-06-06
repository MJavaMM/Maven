package Demo01;

public class Demo04 {
    public static void main(String[] args) {


    String str ="abcdefg";
    StringBuffer st = new StringBuffer(str);
    String s = st.toString();
        System.out.println(s);
        System.out.println("===================");
    st.append("qqqqq");
        System.out.println(st);

        System.out.println("===================");

        for (int i = st.length()-3; i >0; i-=3) {
            st.insert(i,",");

        }
        System.out.println(st);


}
}