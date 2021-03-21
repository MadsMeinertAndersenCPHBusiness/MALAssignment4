import java.sql.Timestamp;
import java.util.UUID;

public class Log {
    private Level level;
    private UUID system;
    private UUID instance;
    private char action;
    private Timestamp timestamp;

    public Log() {
        this.level = Level.INFORMATION;
        this.system = UUID.randomUUID();
        this.instance = UUID.randomUUID();
        this.action = 'a';
        timestamp = new Timestamp(System.currentTimeMillis());

    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public char getAction() {
        return action;
    }

    public void setAction(char action) {
        this.action = action;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Log{" +
                "level=" + level +
                ", system=" + system +
                ", instance=" + instance +
                ", action=" + action +
                ", timestamp=" + timestamp +
                '}';
    }
}
