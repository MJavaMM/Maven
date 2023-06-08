package ex12;

public class Pet {
    public static void main(String[] args) {
        Penguin p = new Penguin();
        p.init();
        p.show();
        System.out.println("==================================");
        p.delete("欧欧");  //删除数据
        p.show();
        System.out.println("==================================");
        p.select("美美");  //存在的数据
        System.out.println("==================================");
        p.select("阿威");  //不存在的数据
    }
}
