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
    /**
     *
     * @param hour
     * @throws IllegalArgumentException not right format of the hour
     */
    public void setHour(int hour) {
        if(hour < 0 || hour > 23){
            throw new IllegalArgumentException("Hours not right format");
        }
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



    /**
     *
     * @param second
     * @throws IllegalArgumentException not right format
     */
    public void setSecond(int second) {
        if(second < 0 || second > 59){
            throw new IllegalArgumentException(" Seconds Not right format");
        }
        this.second = second;
    }
}
