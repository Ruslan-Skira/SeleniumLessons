package lesson9.time;

public class TestTime {
    public static void main(String[] args) {
        Time time = new TimeImpl(1,23, 44);
        System.out.println(time.represent());
        System.out.println(time.represent(TimeFormat.TWELVE_HOURS));
        System.out.println(time.represent(TimeFormat.TWENTYFOUR_HOURS));


        String timeSimpleRepresentAtual = time.represent();

    }

}
