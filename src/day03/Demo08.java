package day03;

import java.util.ArrayList;

@SuppressWarnings("all")
public class Demo08 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        //增
        arrayList.add("hello");
        arrayList.add("world");
        arrayList.add("java");
        System.out.println(arrayList);
        arrayList.add(2,"my");
        System.out.println(arrayList);
        //查
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.size());
        //根据元素删，返回是否删除成功
        System.out.println(arrayList.remove("my"));
        System.out.println(arrayList);
        //根据索引删，返回被删除的元素
        System.out.println(arrayList.remove(2));
        System.out.println(arrayList);
        //改
        arrayList.set(0,"Hello");
        System.out.println(arrayList);
        //遍历
        for(int i = 0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }
    }
}
