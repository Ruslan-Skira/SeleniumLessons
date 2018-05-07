package lesson10.test.runner;

import lesson10.test.AccountTest;
import lesson10.test.BasketTest;
import lesson10.test.FilterTest;
import com.academy.test.api.AllTestsRunner;
import com.academy.test.api.CustomTestsRunner;

public class DemoLesson {
    public static void main(String[] args) {
        //BaseTest baseTest = new BaseTest("", "", "");
//        BaseTest[] tests = {
//                new BasketTest("myLogin", "myPassword", "myHost"),
//                new AccountTest("myLogin", "myPassword", "myHost")};

        AllTestsRunner[] tests = {
                new BasketTest("myLogin", "myPassword", "myHost"),
                new AccountTest("myLogin", "myPassword", "myHost")};

//        System.out.println("******************");
//        for (int i = 0; i < tests.length; i++) {
//            if (tests[i] instanceof BasketTest) {
//                ((BasketTest) tests[i]).testBasketAdd();
//                ((BasketTest) tests[i]).testBasketRemove();
//            }
//            else if (tests[i] instanceof AccountTest)
//                ((AccountTest)tests[i]).testCreateAccount();
//            else
//                System.out.println("Unknown test");
//        }
//
//        System.out.println("******************");
//        for (BaseTest element : tests) {
//            if (element instanceof BasketTest) {
//                ((BasketTest) element).testBasketAdd();
//                ((BasketTest) element).testBasketRemove();
//            }
//            else if (element instanceof AccountTest)
//                ((AccountTest)element).testCreateAccount();
//            else
//                System.out.println("Unknown test");
//        }

        System.out.println("******************");
        for (AllTestsRunner element : tests) {
            // добавили testAll в базовый класс
            element.testAll();
            element.testById(1);
            // Нижняя стала не нужной
//            if (element instanceof BasketTest) {
//                ((BasketTest) element).testAll();
//            }
//            else if (element instanceof AccountTest)
//                ((AccountTest)element).testAll();
//            else
//                System.out.println("Unknown test");
        }

        CustomTestsRunner filterTest = new FilterTest();
        filterTest.runTestByName("filterByColor");
        filterTest.testAll();
        //CustomTestsRunner.bt.authorise();
    }
}
