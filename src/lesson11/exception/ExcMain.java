package lesson11.exception;

public class ExcMain {
    public static void main(String[] args) throws EmptyPasswordCheckedException {
        ShopTest test = new ShopTest();
        System.out.println("beforeTest");
        try {
            test.testLoginPage("MyLogin", "");
            System.out.println("afterTestLogin");
        } catch (EmptyPasswordCheckedException e) {
            System.out.println("EmptyPasswordCheckedException. Details: " + e.getMessage());
            System.out.println("EmptyPasswordCheckedException. Count: " + e.getCountErrors());
        } catch (Exception e) {
            System.out.println("Exception. Details: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("finally");
        }
        System.out.println("afterTest");
    }
}
