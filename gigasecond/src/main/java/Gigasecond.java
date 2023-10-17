import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;

public class Gigasecond {
    private long seconds = 0;

    public Gigasecond(LocalDate moment) {
        this.seconds = moment.toEpochSecond(LocalTime.MIDNIGHT, ZoneOffset.UTC);
    }

    public Gigasecond(LocalDateTime moment) {
        this.seconds = moment.toEpochSecond(ZoneOffset.UTC);
    }

    public LocalDateTime getDateTime() {
        return LocalDateTime.ofEpochSecond(this.seconds + 1000000000, 0, ZoneOffset.UTC);
    }
}
