package lesson11.time;

public class TimeImpl implements Time {
    private int hour;
    private int minute;
    private int second;


    public TimeImpl(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    @Override
    public String represent() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    @Override
    public String represent(TimeFormat format) {
        switch (format) {
            case HOURS12:
                return String.format("%02d:%02d:%02d%s",
                        hour > 12 ? hour - 12 : hour,
                        minute,
                        second,
                        hour > 12 ? "pm" : "am");
            case HOURS24:
                return String.format("%02d:%02d:%02d", hour, minute, second);
            default:
                return represent();
        }
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     *
     * @param minute
     * @throws IllegalArgumentException not right format
     */
    public void setMinute(int minute) {
        if(minute < 0 || minute > 59){
            throw new IllegalArgumentException("Not right format");
        }
        this.minute = minute;
    }




    public void setSecond(int second) {
        this.second = second;
    }
}
