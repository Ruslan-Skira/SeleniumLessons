package lesson10.time;

public interface Time {
    String represent();

    default String represent(TimeFormat format) {
        return represent();
    }
}
