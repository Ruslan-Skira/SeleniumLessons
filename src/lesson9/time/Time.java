package lesson9.time;

import lesson9.time.TimeFormat;

public interface Time {
    String represent();

    default String represent( TimeFormat timeFormat ){
        return represent();
    };


}
