package day04.test3;

public class Test {
    public static void main(String[] args) {
        TestModifi testModifi = new TestModifi();
        //同包 public protected default
        testModifi.testDefault();
        testModifi.testProtect();
        testModifi.testPublic();
    }
}
