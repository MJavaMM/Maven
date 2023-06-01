package Day01;

import Day01Tea.Person;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    public static void main(String[] args) {
        Map map= new HashMap();
        //像集合中新增数据
        map.put("CN","中国");
        map.put("USA","美国");
        map.put("JP","日本");
        map.put(1,"张三");
        map.put("JP1",new Person("q",1));

        System.out.println(map.size());
        System.out.println(map.containsKey("CN"));
        //map.remove("JP");
        System.out.println(map.containsValue("日本"));
        System.out.println("------------");
        System.out.println(map.values());
        System.out.println(map.keySet());
    }
}
