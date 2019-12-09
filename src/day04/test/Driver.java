package day04.test;
@SuppressWarnings("all")
public class Driver extends Employee implements IDrive{
    public Driver(String name, double salary) {
        super(name, salary);
    }

    @Override
    public void work() {
        System.out.println("开车");
    }

    @Override
    public void lilun() {
        System.out.println("理论测试1000题");
    }

    @Override
    public void runTest() {
        System.out.println("行驶测试_倒车入库");
    }

    @Override
    public void drive() {
        System.out.println("送老板上班");
    }
}
