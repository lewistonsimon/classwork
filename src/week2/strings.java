package week2;

public class strings { // make this capital
    public static void main(String[] args) {
        String s1 = "Hi There";
        String s2 = new String("Hi There");

//        // equality test
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s1 == s2); // the == can not test equality of strings; goes to same spot in memory
//        System.out.println(s1.equals(s2)); // this is how you compare strings

//        // Comparing Strings
//        System.out.println("a".compareTo("b"));
//        System.out.println("b".compareTo("a"));
//        System.out.println("b".compareTo("b"));
//            // negative number comes back first string comes before the second
//            // positive number comes back first string comes after the second
//            // 0 comes back if they are the same string
//        System.out.println("cart".compareTo("cargo"));
            // Capital letters comes before lowercase letters

//        // find length of a string
//        System.out.println(s1.length());
//
//        // find a single character
//        String title = "Harry Potter";
//        char oneLetter = title.charAt(6);
//        System.out.println(oneLetter);
//
//        // substring
//        String substring = title.substring(6, 9);
//        System.out.println(substring);

        // exercise
        String s3 = "Monty";
        String s4 = "Python";
        //System.out.println(s3.length() + s2.length());
        //System.out.println(s3.substring(0,2) + s4.substring(4,6));
        //System.out.println(s3.contains("ty") && s4.contains("yt");
        //System.out.println("hello".indexOf("l"));
        System.out.println((s3 + s4).replace("o", "i"));
        System.out.println((s3 + s4).replace("o", " "));
    }
}
