package task;

import java.time.LocalDate;
import java.util.Objects;

public class YearlyTask extends Task {
    private final Integer id;
    public YearlyTask(Type type, LocalDate dateTime, String title, String description) {
        super(type, dateTime, title, description);
        this.id = idGenerator;
    }

    @Override
    public boolean appearsIn(LocalDate date) {
        return Objects.equals(getDateTime().getDayOfYear(), date.getDayOfYear());
    }

    @Override
    public String toString() {
        return  "Yearly task. ID = " + id + ". Title: " + getTitle() +
                "\n Description: " + getDescription() +
                "\n Date: " + getDateTime().getDayOfMonth() + " " + getDateTime().getMonth() +
                "\n Type of task: " + getType().getType() + "\n--------------------";
    }
}
