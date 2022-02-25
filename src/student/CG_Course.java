package student;

public class CG_Course extends Course{

    private String location;

    public CG_Course(String department, String courseNumber,
                     int creditHours, String location) {
        super(department, courseNumber, creditHours);
        this.location = location;
    }



    public String toString() {
        return super.toString() + " is a EWG course located in " + location + ".";
    }
}

