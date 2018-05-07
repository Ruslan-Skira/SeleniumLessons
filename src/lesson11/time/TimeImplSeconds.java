package lesson11.time;

public class TimeImplSeconds implements Time{
    private int second;

    public TimeImplSeconds(int hour, int minute, int second) {
        this.second = second + minute * 60 + hour*60*60;
    }

    @Override
    public String represent() {
        int second = getSecond();
        int minute = getMinute();
        int hour = getHour();
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    @Override
    public String represent(TimeFormat format) {
        int second = getSecond();
        int minute = getMinute();
        int hour = getHour();

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

    public int getSecond() {
        return this.second % 60;
    }

    public int getMinute() {
        return (this.second / 60) % 60;
    }

    public int getHour() {
        return this.second / 60 / 60;
    }
}
