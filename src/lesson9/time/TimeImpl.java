package lesson9.time;

public class TimeImpl implements Time {
    int hours;
    int minutes;
    int secunds;


    @Override //from interface
    public String represent(TimeFormat timeFormat) {
        switch (timeFormat) {
            case TWELVE_HOURS:
                return "" + (hours > 12 ? 12 - hours : hours) + " " + minutes + " " + secunds + " " + (hours > 12 ? " PM" : " AM");
            default:
                return "" + hours + " " + minutes + " " + secunds ;
        }
    }
}

