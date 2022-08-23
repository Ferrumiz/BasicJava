package hashmap;

import java.util.Objects;

public class Course {

    private String name;

    public Course(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return name.equals(course.name);
    }

    @Override
    public int hashCode() {
        int length = this.name.length();
        if (length % 2 == 0) {
            return 131;

        } else {
            return 151;
        }
    }
}
