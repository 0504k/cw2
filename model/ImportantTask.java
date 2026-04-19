package model;

public class ImportantTask extends Task {

    private int priority;

    public ImportantTask(int id, String title, String description, int priority) {
        super(id, title, description);
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return super.toString() + " | Priority: " + priority;
    }
}