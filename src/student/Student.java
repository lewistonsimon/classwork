package student;

import java.util.ArrayList;
import java.util.Collections;

public class Student {

    private static int nextID = 2243;

    private String name;
    private int identificationNumber;
    private ArrayList<Course> courses;
    private Major studentsMajor;
    private boolean hasBeenSorted;

    public Student(String name, int number, Major major) {
        this.identificationNumber = number;
        this.name = name;
        this.courses = new ArrayList<>();
        this.studentsMajor = major;
        this.hasBeenSorted = true;

    }

    public Student(String name, Major major) {
        this.name = name;
        this.identificationNumber = nextID++;
        this.courses = new ArrayList<>();
        this.studentsMajor = major;
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
            courses.add(newCourse);
            this.hasBeenSorted = false;
        }
    }

    public void removeCourse(Course currentCourse) {
        if (courses.contains(currentCourse)) {
            courses.remove(currentCourse);
        }
    }

    public boolean declareMajor() {
        return studentsMajor.qualifyForMajor(courses);
    }

    public String toString() {

        String result = "";
        if (hasBeenSorted == false)
        {
            Collections.sort(courses);
            hasBeenSorted = true;
        }
            if (courses.size() >= 4) {
                if (declareMajor())
                {
                    result = name + " with the ID number "
                            + identificationNumber + " has declared a " + studentsMajor + " major. "
                            + "They qualify for the " + studentsMajor + " major. They are taking " + courses +
                            ". They are a full time student.";
                }
                else
                {
                    result = name + " with the ID number "
                            + identificationNumber + " has declared a " + studentsMajor + " major. "
                            + "They are taking " + courses +
                            ". They do not qualify for the " + studentsMajor + " major yet." +
                            " They are a full time student.";
                }
            }
            else if (courses.size() < 4 && courses.size() > 0) {
                if (declareMajor())
                {
                    result = name + " with the ID number "
                            + identificationNumber + " has declared a " + studentsMajor + " major" +
                            ". They qualify for the major " +
                            ". They are taking " + courses +
                            ". They can take more classes.";
                }
                else
                {
                    result = name + " with the ID number "
                            + identificationNumber + " has declared a " + studentsMajor + " major " +
                            ". They are taking " + courses + " They do not qualify for the " + studentsMajor + " major yet" +
                            ". They can take more classes.";
                }
            }
            else if (courses.size() == 0) {
                if (declareMajor())
                {
                    result = name + " with the ID number "
                            + identificationNumber + " has declared a " + studentsMajor + " major"
                            + "They have qualified for the " + studentsMajor + " major. They are currently not enrolled in any classes.";
                }
                else {
                    result = name + " with the ID number "
                            + identificationNumber + " has declared a " + studentsMajor + " major. "
                            + "They have nat qualified for the " + studentsMajor + " major. They are currently not enrolled in any classes.";
                }
            }
            return result;


    }

}


