package student;

public class CourseTester {
    public static void main(String[] args) {
        Course courseOne = new Course("HIST", "122", 4);
        //System.out.println(courseOne);
        Course courseTwo = new Course("CMSC", "155", 4);
        //System.out.println(courseTwo);
        Course courseThree = courseOne;

        System.out.println(courseOne.equals(courseThree));
        System.out.println(courseOne.equals(courseTwo));

    }
}

