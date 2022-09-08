package logparser.model;

import org.jetbrains.annotations.NotNull;

public class User implements Comparable<User> {

    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    // a , b
    // a<b : -1
    // a==b : 0
    // a>b : 1

    @Override
    public int compareTo(@NotNull User o) {
        return name.compareTo(o.name);
    }
}
