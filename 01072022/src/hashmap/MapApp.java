package hashmap;

import java.util.HashMap;

public class MapApp {

    public static void main(String[] args) {

        HashMap<Course, String> map = new HashMap<>();

        Course java = new Course("Java");
        Course php = new Course("PHP");
        Course sql = new Course("SQL");
        Course python = new Course("Python");
        Course algo = new Course("Algo");

        map.put(java, "hello java");
        map.put(php, "hello php");
        map.put(sql, "hello sql");
        map.put(python, "hello python");
        map.put(algo, "hello algo");

        String s = map.get(algo);

    }
}
