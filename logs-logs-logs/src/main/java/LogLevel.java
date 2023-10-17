import java.util.Arrays;

public enum LogLevel {

    UNKNOWN("", 0),
    TRACE("TRC", 1),
    DEBUG("DBG", 2),
    INFO("INF", 4),
    WARNING("WRN", 5),
    ERROR("ERR", 6),
    FATAL("FTL", 42);

    private final String shortLevel;
    private final int encodedLevel;

    LogLevel(String shortLevel, int encodedLevel) {
        this.shortLevel = shortLevel;
        this.encodedLevel = encodedLevel;
    }

    public String getShortLevel() {
        return shortLevel;
    }

    public int getEncodedLevel() {
        return encodedLevel;
    }

    public static LogLevel getLogLevel(String shortLevel) {
		return Arrays.stream(LogLevel.values())
        .filter(log -> log.shortLevel.equals(shortLevel))
        .findFirst()
        .orElse(UNKNOWN);
	}

}
