package day06;

import java.util.ArrayList;
import java.util.Iterator;

@SuppressWarnings("all")
public class Demo09 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        Person p1 = new Person("Rose",18);
        Person p2 = new Person("Jack",16);
        Person p3 = new Person("Trump",62);
        list.add(p1);
        list.add(p2);
        list.add(p3);

        Iterator<Person> iterator = list.iterator();

        int sum = 0;
        while (iterator.hasNext()){
            Person p = iterator.next();
            System.out.println(p.getName()+"\t"+p.getAge());
            sum+=p.getAge();
        }
        System.out.println("三人总年龄为:"+sum);

    }
}
