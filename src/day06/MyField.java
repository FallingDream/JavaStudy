package day06;
@SuppressWarnings("all")
public class MyField<T,E> {
    public T myfield;
    public E myAnotherField;

    public E getMyAnotherField() {
        return myAnotherField;
    }

    public void setMyAnotherField(E myAnotherField) {
        this.myAnotherField = myAnotherField;
    }

    public T getMyfield() {
        return myfield;
    }

    public void setMyfield(T myfield) {
        this.myfield = myfield;
    }

    public<T> void MyMethod(T t){
        System.out.println("泛型方法:"+t);
    }
}
