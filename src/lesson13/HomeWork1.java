package lesson13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork1 {

    public static void main(String[] args) {
        String [] array = {"Peter", "Helen", "Andry", "Abdel", "Kate", "Veronica", "Leonid", "Alex", "max"};
        List<String>list = new ArrayList<>(Arrays.asList(array));
        System.out.println(list);
    }
}



