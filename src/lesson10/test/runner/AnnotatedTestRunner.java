package lesson10.test.runner;

import lesson10.test.BasketTest;
import com.academy.test.api.Test;
import com.sun.org.apache.xpath.internal.operations.String;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotatedTestRunner {

    public static void main(String[] args)  {
//        try {
//            Method[] methods = BasketTest.class.getDeclaredMethods();
//            Constructor<BasketTest> constructor = BasketTest.class.getDeclaredConstructor(String.class, String.class, String.class);
//            Object basketTest = constructor.newInstance("myLogin", "myPassword", "url");
//            for (Method method : methods) {
//                if (method.isAnnotationPresent(Test.class))
//                    method.invoke(basketTest);
//            }
//        } catch (NoSuchMethodException e) {
//            e.printStackTrace();
//        } catch (InstantiationException e) {
//            e.printStackTrace();
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        } catch (InvocationTargetException e) {
//            e.printStackTrace();
//        }
    }
}
