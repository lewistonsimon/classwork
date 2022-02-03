package student;

public class Course {

    private String department;
    private String courseNumber;
    private int creditHours;

    public Course(String department, String courseNumber, int creditHours) {
        this.department = department;
        this.courseNumber = courseNumber;
        this.creditHours = creditHours;

    }

    public String toString() {

        return department + " " + courseNumber + " is a course that has " +
                creditHours + " credit hours.";
    }

    public static void main(String[] args) {
        Course courseOne = new Course("HIST", "122", 4);
        System.out.println(courseOne);
        Course courseTwo = new Course("CMSC", "155", 4);
        System.out.println(courseTwo);
    }
}



