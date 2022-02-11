package student;

public class Student {

    private static int nextID = 2243;

    private String name;
    private int identificationNumber;

    public Student(String name, int number) {
        this.identificationNumber = number;
        this.name = name;
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

    public String toString() {

        return name + " is the name of a student who has the ID number "
                + identificationNumber;
    }

}




// Go to Carver at 3:40

