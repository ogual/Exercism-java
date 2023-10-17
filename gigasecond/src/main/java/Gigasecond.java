import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;

public class Gigasecond {

    private final LocalDateTime moment;
    private final long GIGASECOND = 1_000_000_000L;

    Gigasecond(LocalDate moment) {
        this.moment = moment.atStartOfDay();
    }
    Gigasecond(LocalDateTime moment) {
        this.moment = moment;
    }
    LocalDateTime getDateTime() {
        return moment.plusSeconds(GIGASECOND);
    }
    
    
}
