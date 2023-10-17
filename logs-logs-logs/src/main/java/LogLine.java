import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogLine {

    private LogLevel logLevel;
    private String message;

    public LogLine(String logLine) {
        Pattern pattern = Pattern.compile("\\[(\\w+)\\]: (.+)");
        Matcher matcher = pattern.matcher(logLine);
        
        if (matcher.find()) {
            this.logLevel = LogLevel.getLogLevel(matcher.group(1));
            this.message = matcher.group(2);
        }
    }

    public LogLevel getLogLevel() {
        return this.logLevel;
    }

    public String getOutputForShortLog() {
        return String.format("%d:%s", this.logLevel.getEncodedLevel(), this.message);
    }

}
