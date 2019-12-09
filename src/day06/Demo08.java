package day06;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings("all")
public class Demo08 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(300);

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
