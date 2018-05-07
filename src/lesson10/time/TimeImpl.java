package lesson10.time;

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
}
