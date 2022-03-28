package week11;

import java.util.ArrayList;
import java.util.Arrays;

public class PigeonHole {
    public static final int OLDEST_PERSON = 130;

    public static void runPigeonHole(Person[] arr) {
        ArrayList<Person>[] age = new ArrayList[OLDEST_PERSON];
        for (int i = 0; i < age.length; i++) {
            age[i] = new ArrayList<>();
        }

        for (Person person : arr) {
            age[person.getAge()].add(person);
        }
        int count = 0;
        for (int indexArray = 0; indexArray < age.length; indexArray++) {
            for (int indexList = 0; indexList < age[indexArray].size(); indexList++) {
                arr[count] = age[indexArray].get(indexList);
                count++;
            }
        }
    }

    public static void main(String[] args) {
        Person [] test = {new Person("Bob", 40),
                new Person("Jill", 52),
                new Person("Tom", 50),
                new Person("Suzy", 50)};
        System.out.println(Arrays.toString(test));
        runPigeonHole(test);
        System.out.println(Arrays.toString(test));
//        Person x = new Person("suzy", 22);
//        System.out.println(x);
    }
}



// Radix Sort for Strings
// eats, etc_, run_, ran_, ate_, eat_
//a: ate_
//        t: ate
//e: eat_ etc_ eats
//        a: eat_ eats
//            t
//        t: etc_
//r: run_ ran_
//        a: ran
//        u: run




