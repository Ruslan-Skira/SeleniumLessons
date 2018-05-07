package lesson10.test.api;

import com.academy.test.api.AllTestsRunner;

public interface CustomTestsRunner extends AllTestsRunner {
    void runTestByName(String name);
}
