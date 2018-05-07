package lesson9.time;

public class TimeImpl implements Time {
    private int hours;
    private int minutes;
    private int secunds;

    public TimeImpl (int hours, int minutes, int secunds){
        this.hours = hours;
        this.minutes = minutes;
        this.secunds = secunds;

    }


    @Override //from interface
    public String represent(TimeFormat timeFormat) {
        switch (timeFormat) {
            case TWELVE_HOURS:
                return "" + (hours > 12 ? hours - 12 : hours) + " " + minutes + " " + secunds + " " + (hours > 12 ? " PM" : " AM");
            default:
                return "" + hours + " " + minutes + " " + secunds ;
        }
    }

    @Override
    public String represent() {
        return String.format("%02d: %02d: %02d: ");
    }

}

