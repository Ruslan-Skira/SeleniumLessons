package lesson8.test;

public class TestRunner {
    public static void main(String[] args) {

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "BasketTest":
                    BasketTest test = new BasketTest("myLogin", "123", "my.private.host.com");
                    test.testBasketAdd();
                    test.testBasketRemove();
                    break;

                case "AccountTest":
                    AccountTest accountTest = new AccountTest("myLogin", "123", "my.private.host.com");
                    accountTest.testCreateAccount();
                    break;

                default:
                    System.out.println("Некорретное название теста");
                    break;
            }
        }
    }
}
