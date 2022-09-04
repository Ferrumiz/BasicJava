package enumexample;

public enum UserState {
    ACTIVE("This user's active", 1000),
    NOT_ACTIVE("This user's inactive", 2000);

    private String description;

    private int period;

    UserState(String description, int period) {
        this.description = description;
        this.period = period;
    }

    public String getDescription() {
        return description;
    }

    public int getPeriod() {
        return period;
    }
}
