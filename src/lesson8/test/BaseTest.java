package lesson8.test;

public class BaseTest {
    protected String login;
    protected String password;
    protected String url;
//constructor
    public BaseTest(String login, String password, String url) {
        this.login = login;
        this.password = password;
        this.url = url;
    }

    protected void authorise() {
        System.out.println(String.format("Авторизируюсь: login %s, password %s",
                login, password));
    }

    protected boolean isAuthorised() {
        System.out.println("авторозирован?->да");
        return true;
    }
    //p

    @Override
    public String toString() {
        return "BaseTest{}";
    }
}
