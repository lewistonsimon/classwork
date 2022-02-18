package student;

import java.util.ArrayList;

public class Student {

    private static int nextID = 2243;

    private String name;
    private int identificationNumber;
    private ArrayList<Course> courses;

    public Student(String name, int number) {
        this.identificationNumber = number;
        this.name = name;
        this.courses = new ArrayList<>();

    }

    public Student(String name) {
        this.name = name;
        this.identificationNumber = nextID++;
    }

    public void rename(String newName) {
        this.name = newName;
    }

    public boolean precedesById(Student bob1) {
        boolean result;
        if (bob1.identificationNumber > identificationNumber) {
            result = true;
        }
        else {
            result = false;
        }
        System.out.println(result);
        return result;
    }

    public void addCourse(Course newCourse) {
        if (!courses.contains(newCourse)) {
            if (courses.size() < 4) {
                courses.add(newCourse);
            }
        }
    }

    public void removeCourse(Course currentCourse) {
        if (courses.contains(currentCourse)) {
            courses.remove(currentCourse);
        }
    }

    public String toString() {

        String result = "";
        if (courses.size() == 4) {
            result = name + " has the ID number "
                    + identificationNumber + " and is taking " + courses +
                    ". They are a full time student.";
        }
        else if (courses.size() < 4 && courses.size() > 0) {
            result = name + " has the ID number "
                    + identificationNumber + " and is taking " + courses +
                    ". They can take more classes.";
        }
        else if (courses.size() == 0) {
            result = name + " has the ID number "
                    + identificationNumber +
                    ". They are not enrolled in any classes.";
        }
        return result;
    }

}
