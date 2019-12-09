package day06;
@SuppressWarnings("all")
public class Demo10 {
    public static void main(String[] args) {
        MyField<String,Integer> myField = new MyField<String,Integer>();
        myField.setMyfield("wang");
        myField.setMyAnotherField(21);
        MyField<Integer,String> myField1 = new MyField<Integer,String>();
        myField1.setMyfield(21);
        myField1.setMyAnotherField("www");
        myField.MyMethod(123);
        myField.MyMethod("wang");
    }
}
