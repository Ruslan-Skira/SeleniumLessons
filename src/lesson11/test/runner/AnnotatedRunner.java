package lesson11.test.runner;

import lesson11.test.BasketTest;
import lesson11.test.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class AnnotatedRunner {
    public static void main(String[] args) throws Exception  {
            Method[] methods = BasketTest.class.getDeclaredMethods();
            Constructor<BasketTest> constructor = BasketTest.class.getDeclaredConstructor(String.class, String.class, String.class);
            Object basketTest = constructor.newInstance("myLogin", "myPassword", "url");
            for (Method method : methods) {
                method.setAccessible(true);
                if (method.isAnnotationPresent(Test.class))
                    method.invoke(basketTest);
            }
    }
}
