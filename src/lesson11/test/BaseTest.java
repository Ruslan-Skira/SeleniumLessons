package lesson11.test;

import lesson11.test.api.AllTestsRunner;

public abstract class BaseTest implements AllTestsRunner {
    protected String login;
    protected String password;
    protected String url;

    // Конструктор
    protected BaseTest(String login, String password, String url) {
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

    public abstract void testAll();

    @Override
    public String toString() {
        return "BaseTest{}";
    }
}
