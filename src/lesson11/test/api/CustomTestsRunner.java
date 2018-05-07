package lesson11.test.api;

import lesson11.test.api.AllTestsRunner;

public interface CustomTestsRunner extends AllTestsRunner {
    void runTestByName(String name);
}
