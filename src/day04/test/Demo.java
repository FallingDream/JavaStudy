package day04.test;
@SuppressWarnings("all")
public class Demo {
    public static void main(String[] args) {
        Manager manager = new Manager("王",10000,5000);
        Waiter waiter1 = new Waiter("赵",5000);
        Waiter waiter2 = new Waiter("钱",6000);
        Cook cook = new Cook("孙",4000);
        Driver driver = new Driver("李",5000);
        manager.work();
        waiter1.work();
        waiter2.work();
        cook.work();
        System.out.println("总工资为:"+(manager.getSalary()+manager.getBonus()+waiter1.getSalary()
                                    +waiter2.getSalary()+cook.getSalary()));
        manager.drive();
        driver.lilun();
        driver.runTest();
        driver.drive();

    }
}
