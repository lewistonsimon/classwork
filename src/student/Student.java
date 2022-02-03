package student;

public class Student {

    private String name;
    private int identification_number;

    public Student(String name, int number) {
        this.identification_number = number;
        this.name = name;
    }

    public void rename(String newName) {
        this.name = newName;
    }



    public String toString() {

        return name + " is the name of a student who has the ID number "
                + identification_number;
    }

    public static void main(String[] args) {
        Student studentOne = new Student("Tim", 1234);
        System.out.println(studentOne);
        Student studentTwo = new Student("Sarah", 5678);
        System.out.println(studentTwo);
        studentTwo.rename("Lucy");
        System.out.println(studentTwo);
    }
}


// Go to Carver at 3:40

