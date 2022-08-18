package set.appset;

import java.util.*;

public class AppSet {
    public static void main(String[] args) {

        Course courseOne = new Course("Algo", 10, "Author One");
        Course courseTwo = new Course("Math", 5, "Author Two");
        Course courseThree = new Course("Algo", 10, "Author One");
        Course courseFour = new Course("DataBase", 20, "Author Three");

        List<Course> courses = new ArrayList<>(Arrays.asList(courseOne, courseTwo, courseThree, courseFour));

        AppSet appSet = new AppSet();
        Set<Course> uniqueCourses = appSet.getUniqueCourses(courses);
        Iterator<Course> iterator = uniqueCourses.iterator();
        while (iterator.hasNext()) {
            Course course = iterator.next();
            System.out.println(course);
        }

        System.out.println("Set contains courseFour    - "+ uniqueCourses.contains(courseFour));
        courseFour.setDuration(15);
        System.out.println("Set contains courseFour    - "+ uniqueCourses.contains(courseFour));

    }

    private Set<Course> getUniqueCourses(List<Course> courseList) {
        Set<Course> courseSet = new HashSet<>();
        for (Course course : courseList) {
            courseSet.add(course);
        }

        return courseSet;
    }

}
