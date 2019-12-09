package day04.test;
@SuppressWarnings("all")
public class Manager extends Employee implements IDrive{
    private double bonus;

    @Override
    public void work() {
        System.out.println("管理酒店");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
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
        System.out.println("开车上班");
    }
}
