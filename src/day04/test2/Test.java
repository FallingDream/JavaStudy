package day04.test2;

import day04.test3.TestModifi;

public class Test extends TestModifi {
    public static void main(String[] args) {
        Test test = new Test();
        //不同包的子类 public protected
        test.testProtect();
        test.testPublic();

    }
}

