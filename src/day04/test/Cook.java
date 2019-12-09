package day04.test;
@SuppressWarnings("all")
public class Cook extends Employee{
    public Cook(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("做饭");
    }
}
