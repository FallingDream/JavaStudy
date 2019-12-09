package day04.test;
@SuppressWarnings("all")
public class Waiter extends Employee{
    public Waiter(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("上菜和结账");
    }
}
