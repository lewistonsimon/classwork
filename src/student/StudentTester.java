package student;

public class StudentTester {
    public static void main(String[] args) {
//        Student studentOne = new Student("Tim", 1234);
//        System.out.println(studentOne);
//        Student studentTwo = new Student("Sarah", 5678);
//        System.out.println(studentTwo);
//        studentTwo.rename("Lucy");
//        System.out.println(studentTwo);
//        Student studentThree = new Student("Andy");
//        System.out.println(studentThree);
//        Student studentFour = new Student("Zoey");
//        System.out.println(studentFour);

        Student bob1 = new Student("Bob Smith", 97100);
        Student bob2 = new Student("Bob Jones", 4321);
        bob1.precedesById(bob2);
        bob2.precedesById(bob1);

    }

}
