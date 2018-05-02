package lesson9.test;

public class AccountTest extends BaseTest {

    public AccountTest(String login, String password, String url) {
        super(login, password, url);
    }

    public void testCreateAccount() {
        System.out.println("start testCreateAccount");
        // проверка, если за логинен
        //boolean authorised = isAuthorised();
        if (!isAuthorised())
            authorise();
    }

    public void testAll() {
        testCreateAccount();
    }

    @Override
    public void testById(int id) {
        System.out.println("Account version testById id = " + id);
    }
}
