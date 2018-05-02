package lesson9.time;

public class TimeImplSeconds implements Time {
    int seconds;

    @Override
    public String represent(TimeFormat timeFormat) {
        int hours = seconds / (60 * 60);
        int minutes =  (seconds % (60 * 60))/60;
        int seconds_ = seconds % 60;

        switch (timeFormat) {
            case TWELVE_HOURS:
                return "" + (hours > 12 ? 12 - hours : hours) + " " + minutes + " " + seconds_ + " " + (hours > 12 ? " PM" : " AM");
            default:
                return "" + hours + " " + minutes + " " + seconds_ ;
        }
    }
}
