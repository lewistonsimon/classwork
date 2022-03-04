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

    @Override
    public boolean equals(Object obj) {
        boolean result;
        if (obj instanceof Course)
        {
            Course courseOne = (Course) obj;
            if (courseOne.department.equals(department) &&
                    courseOne.courseNumber.equals(courseNumber) &&
                    courseOne.creditHours == creditHours)
            {
                result = true;
            }
            else
            {
                result = false;
            }
            return result;
        }
        else
        {
            return false;
        }
    }

    public String getDepartment() {
        return this.department;
    }

    public int getCourseNumber() {
        int courseNum = Integer.parseInt(courseNumber);

        return courseNum;
    }

    public String toString() {

        return department + " " + courseNumber + " with " +
                creditHours + " credit hours";
    }

}





