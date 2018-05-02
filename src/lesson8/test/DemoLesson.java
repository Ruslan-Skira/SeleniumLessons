package lesson8.test;

public class DemoLesson {
    public static void main(String[] args) {

        BaseTest[] tests = {
                new BasketTest("myLogin","myPassword","myHost"),
                new AccountTest("myLogin","myPassword","myHost")
        };


        for (BaseTest test : tests) {
            if (test instanceof BasketTest) {
                ((BasketTest) test).testBasketAdd();
                ((BasketTest) test).testBasketAdd();
            } else if (test instanceof AccountTest) {
                ((AccountTest) test).testCreateAccount();
            } else {

            }

        }

    }
}
