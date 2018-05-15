package lesson12;

import sun.net.www.content.text.Generic;

public class GenArrayTest {
    public static void main(String[] args) {
        GenericArray<String> gen = new GenericArray<>("one", "two","three","four");
        gen.set("Hello", 3);
        System.out.println(gen.get(3));

        GenericArray<Integer> number = new GenericArray<>(3,2,4,5);
        number.set(77, 3);
        System.out.println(number.get(3));


        //Object obj = gen.get(2);
    }

}
