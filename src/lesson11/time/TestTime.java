package lesson11.time;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class TestTime {
    public static void main(String[] args) {
        Time time1 = new TimeImpl(22, 34, 5);
        Time time2 = new TimeImplSeconds(22, 34, 5);
        System.out.println(time1.represent());
        System.out.println(time1.represent(TimeFormat.HOURS12));
        System.out.println(time1.represent(TimeFormat.HOURS24));

        System.out.println("*********");
        System.out.println(time2.represent());
        System.out.println(time2.represent(TimeFormat.HOURS12));
        System.out.println(time2.represent(TimeFormat.HOURS24));

        // TESTING
        String timeSimpleRepresentActual = time1.represent();
        String timeHours24RepresentActual = time2.represent(TimeFormat.HOURS24);
        String timeHours12RepresentActual = time1.represent(TimeFormat.HOURS12);
//        String timeSimpleRepresentExpected = "22:34:05";
//        String timeSimpleRepresentExpected = "22:34:05";
        System.out.println(timeSimpleRepresentActual.equals("22:34:05"));
        assert timeSimpleRepresentActual.equals("22:34:05");
        assert timeHours24RepresentActual.equals("22:34:06");
        assert timeHours12RepresentActual.equals("10:34:05pm");
// Testing minutes for the exeptions
        //((TimeImpl) time1).setMinute(232);

        TimeImpl time3 = new TimeImpl(1, 1, 1);
        try {
            TimeImpl time4 = new TimeImpl(1, 1, 1);
        } catch (TimeoutException e) {
            System.out.println(e.getMessage());
        }
        time3.setMinute(59);

        time3.setHour(23);
        time3.setSecond(59);
    }

}
