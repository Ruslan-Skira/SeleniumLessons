package lesson11.exception;

public class ShopTest {

    public void testLoginPage(String login, String password)
            throws EmptyPasswordCheckedException {
        if (password.isEmpty()) {
            EmptyPasswordCheckedException exc = new EmptyPasswordCheckedException("Empty password");
            exc.setCountErrors(1);
            throw exc;
        }

        int[] arr = {1};
        System.out.println(arr[10]);

        System.out.println("testLogin");
    }
}
