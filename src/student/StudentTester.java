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

//        Student bob1 = new Student("Bob Smith", 97100);
//        Student bob2 = new Student("Bob Jones", 4321);
//        bob1.precedesById(bob2);
//        bob2.precedesById(bob1);

//        Student studentSimon = new Student("Simon", 1122);
//        studentSimon.addCourse(new Course("CMSC", "155", 4));
//        studentSimon.addCourse(new Course("CMSC", "155", 4));
//        studentSimon.addCourse(new Course("HIST", "122", 4));
//        studentSimon.addCourse(new Course("Foundations", "111", 4));
//        studentSimon.addCourse(new Course("MIS", "145", 4));
//        studentSimon.addCourse(new Course("REL", "150", 4));
//        System.out.println(studentSimon);
//
//        studentSimon.removeCourse(new Course("Foundations", "111", 4));
//        studentSimon.removeCourse(new Course("MATH", "120", 4));
//        System.out.println(studentSimon);
//
//        studentSimon.addCourse(new Course("Foundation", "111", 4));
//        System.out.println(studentSimon);
////
//        System.out.println();
//
//        Workstudy_Student studentJacob = new Workstudy_Student("Jacob", 3344, 0);
//        System.out.println(studentJacob);
//        studentJacob.addCourse(new Course("MATH", "210", 4));
//        studentJacob.addCourse(new Course("ENG", "170", 4));
//        System.out.println(studentJacob);
//        studentJacob.removeCourse(new Course("ENG", "170", 4));
//        System.out.println(studentJacob);
//        studentJacob.addCourse(new Course("ENG", "170", 4));
//        studentJacob.addCourse(new Course("ENG", "170", 4));
//        studentJacob.addCourse(4);
//        System.out.println(studentJacob);

//        System.out.println();
//
//        Workstudy_Student studentEmmett = new Workstudy_Student("Emmett",
//                7777, 0);
//        studentEmmett.addCourse(new Course("HIST", "122", 4));
//        studentEmmett.addCourse(new Course("MIS", "145", 4));
//        studentEmmett.addCourse(new Course("BIO", "232", 4));
//        System.out.println(studentEmmett);
//        studentEmmett.addHours(5);
//        studentEmmett.removeCourse(new Course("MIS", "145", 4));
//        System.out.println(studentEmmett);
//
//        System.out.println();
//
//        Student studentNick = new Student("Nick", 1223);
//        studentNick.addCourse(new Course("MATH", "122", 4));
//        studentNick.addCourse(new CG_Course("ENG", "145", 4, "West Des Moines"));
//        studentNick.addCourse(new CG_Course("PYSC", "210", 4, "West Des Moines"));
//        System.out.println(studentNick);
//        studentNick.removeCourse(new CG_Course("PYSC", "210", 4, "West Des Moines"));
//        System.out.println(studentNick);

//        Student studentSamTheMathMan = new Student("Sam", 1298, new Math());
//        studentSamTheMathMan.addCourse(new Course("MATH", "245", 4));
//        studentSamTheMathMan.addCourse(new Course("MATH", "215", 4));
//        studentSamTheMathMan.addCourse(new Course("MATH", "320", 4));
//        studentSamTheMathMan.addCourse(new Course("CMSC", "155", 4));
//        studentSamTheMathMan.addCourse(new Course("CMSC", "355", 4));
//        studentSamTheMathMan.addCourse(new Course("CMSC", "150", 4));
//        System.out.println(studentSamTheMathMan);
//
//        System.out.println();
//
//        Student studentLaurenTheCMSCGirl = new Student("Lauren", 5649, new CMSC());
//        studentLaurenTheCMSCGirl.addCourse(new Course("CMSC", "150", 4));
//        studentLaurenTheCMSCGirl.addCourse(new Course("CMSC", "155", 4));
//        studentLaurenTheCMSCGirl.addCourse(new Course("CMSC", "250", 4));
//        System.out.println(studentLaurenTheCMSCGirl);
//
//        System.out.println();
//
//        Student studentChuck = new Student("Chuck", 4243, new Math());
//        studentChuck.addCourse(new Course("MATH", "105", 4));
//        studentChuck.addCourse(new Course("MATH", "190", 4));
//        studentChuck.addCourse(new Course("MATH", "213", 4));
//        studentChuck.addCourse(new Course("CMSC", "220", 4));
//        studentChuck.addCourse(new Course("CMSC", "220", 4));
//        studentChuck.addCourse(new Course("CMSC", "340", 4));
//        System.out.println(studentChuck);
//
//        System.out.println();
//
//        Student studentMaddie = new Student("Maddie", 2375, new CMSC());
//        studentMaddie.addCourse(new Course("CMSC", "233", 4));
//        studentMaddie.addCourse(new Course("CMSC", "130", 4));
//        studentMaddie.addCourse(new Course("CMSC", "345", 4));
//        System.out.println(studentMaddie);

        Student carter = new Student("Carter", 123, new Math());
        Student carterjr = new Student("Carter", 123, new Math());
        Student ben = new Student("Ben", 12343, new Math());

        System.out.println(carterjr.hashCode());
        System.out.println(carter.hashCode());
        System.out.println(ben.hashCode());


    }

}


