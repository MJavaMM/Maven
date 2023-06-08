package ex12;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.*;

public class Penguin {
   static Map<String, Penguin> penguin = new HashMap<>();
    public String name;
    public String sex;

    public Penguin() {
    }

    public Penguin(String name, String sex) {
        this.name = name;
        this.sex = sex;

    }

    public static Map<String, Penguin> getPenguin() {
        return penguin;
    }

    public static void setPenguin(Map<String, Penguin> penguin) {
        Penguin.penguin = penguin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Map init(){   //初始化

    Penguin p1 = new Penguin("欧欧","Q仔");
    Penguin p2 = new Penguin("亚亚","Q妹");
    Penguin p3 = new Penguin("菲菲","Q妹");
    Penguin p4 = new Penguin("美美","Q妹");
    penguin.put("欧欧",p1);
    penguin.put("亚亚",p2);
    penguin.put("菲菲",p3);
    penguin.put("美美",p4);
    return penguin;
    }

    int count=0;
    public void show(){    //遍历map集合
        Set<String> strings = penguin.keySet();
        for (String pen:strings) {
            System.out.println(pen+" "+penguin.get(pen).getSex());
            count++;
        }
        System.out.println("共计有"+penguin.size()+"只企鹅");
    }

    public void delete(String name){           //删除
        Set<String> strings = penguin.keySet();
        for (String pen:strings) {
            if(pen.equals(name)){
                strings.remove(pen);
                return;
            }
        }
        System.out.println("没有找到需要删除的宠物信息！");
        System.out.println("共计有"+penguin.size()+"只企鹅");
    }

    public void select(String name){           //删除
        Set<String> strings = penguin.keySet();
        for (String pen:strings) {
            if(pen.equals(name)){
                System.out.println("已找到！");
                return;
            }
        }
        System.out.println("没有找到需要删除的宠物信息！");
    }

}
