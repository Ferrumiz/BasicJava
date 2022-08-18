package set.appset;

public class Course {
    private String name;
    private int duration;
    private String author;

    public void setName(String name) {
        this.name = name;
    }

    public Course(String name, int duration, String author) {

    }

    public String getName() {
        return name;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
