package day06;

import java.util.HashSet;
import java.util.Iterator;

/**
 * HashSet集合
 * @author wang
 * @create 2019-12-09 16:05
 **/
@SuppressWarnings("all")
public class Demo12 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("q");
        set.add("w");
        set.add("e");
        set.add("r");
        set.add("q");
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
