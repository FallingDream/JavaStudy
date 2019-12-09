package day06;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * HashMap与LinkedHashMap
 * LinkedHashMap插入有序，HashMap根据HashCode分配存储
 * @author wang
 * @create 2019-12-09 16:43
 **/
@SuppressWarnings("all")
public class Demo13 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("zhao","21");
        map.put("qian","25");
        map.put("sun","30");
        map.put("li","21");
        map.put("zhao","40");

        String value = map.get("zhao");
        System.out.println(value);
        System.out.println("==============");

        //1.使用keyset遍历
        Set<String> keySet = map.keySet();
        for (String temp:keySet){
            System.out.println(temp+"-----"+map.get(temp));
        }
        System.out.println("=============");

        //2.使用EntrySet遍历
        Set<Map.Entry<String, String>> EntrySet = map.entrySet();
        for (Map.Entry<String, String> temp:EntrySet){
            System.out.println(temp.getKey()+"-----"+temp.getValue());
        }
        System.out.println("=============");

        //LinkedHashMap
        LinkedHashMap<String, String> map1 = new LinkedHashMap<>();

        map1.put("甲","10");
        map1.put("乙","5");
        map1.put("丙","13");

        Set<String> keySet1 = map1.keySet();

        for (String temp:keySet1){
            String value1 = map1.get(temp);
            System.out.println(temp+"------"+value1);
        }
    }
}
