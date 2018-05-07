package lesson10.tmp;

public class AppMain {
    public static void main(String[] args) {
        int hour1 = 2;
        int hour2 = 21;
        int minute = 7;

        System.out.println(String.format("%02d:%02d", hour1, minute));
        System.out.println(String.format("%02d", hour2));

        Integer n1 = 234;
        Integer n2 = 234;
        System.out.println(n1 == n2);

        sayHello();
        sayHello("Ivan");
    }


    private static void sayHello() {

    }

    private static void sayHello(String name) {

    }
}
