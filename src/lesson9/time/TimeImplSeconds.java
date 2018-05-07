package lesson9.time;

public class TimeImplSeconds implements Time {
    int seconds;

    @Override
    public String represent() {

        return null;
    }

    @Override
    public String represent(TimeFormat timeFormat) {
        int hours = seconds / (60 * 60);
        int minutes =  (seconds % (60 * 60))/60;
        int seconds = this.seconds % 60;

        switch (timeFormat) {
            case TWELVE_HOURS:
                return "" + (hours > 12 ? 12 - hours : hours) + " " + minutes + " " + seconds + " " + (hours > 12 ? " PM" : " AM");
            default:
                return "" + hours + " " + minutes + " " + seconds ;
        }
    }

    public int getSecond(){
        return this.seconds % 60;
    }

    public int getMinute() {
        return (seconds % (60 * 60))/60;

    }

    public TimeImplSeconds(int hours, int minutes, int seconds){
        this.seconds = seconds + 60 * minutes + 60 * 60 * hours;
    }
}
