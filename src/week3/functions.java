package week3;

// In Java functions are called methods; a function inside a class
// every method should either have print messages or return value but not both. Looks confusing
// and does not provide any value

public class functions { // class needs to be capital should be public class Functions

    public static String singFullSong(String name, int age) {
        String mainClause = "Happy birthday to you";
        String out = mainClause + " " + mainClause;
        out += " Happy birthday dear " + name + " ";
        out += mainClause;
        return out;
    }

    public static void singhappyBirthday(String name, int age) {
        System.out.println(singFullSong(name, age));
        System.out.println("You are " + age + " years old");
    }

    public static void main(String[] args) {
        // public means you can see it outside the class
        // static means there are no attributes
        // void means no return statement
        System.out.println("Starting Main");
        singhappyBirthday("Suzy", 5);
        System.out.println("Back in Main");
    }

//    public static boolean isOdd(int number) {
//        if (number % 2 != 0) {
//            return true;}
//        else {
//                return false;
//            }

//    }
//    public static void main(String[] args) {
//        if (isOdd(41)) {
//            System.out.println("it is odd");
//        }
//    }

}


