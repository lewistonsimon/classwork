package student;

public class Workstudy_Student extends Student{

    private double hoursWorked;

    public Workstudy_Student(String name, int number, double hours) {
        super(name, number);
        this.hoursWorked = hours;
    }

    public void timeWorked(double moreHours) {
        this.hoursWorked = moreHours;
    }

    public String toString() {
        return super.toString() + " They have a workstudy where they earned " +
                (hoursWorked * 7.25) + " dollars.";
    }
}
