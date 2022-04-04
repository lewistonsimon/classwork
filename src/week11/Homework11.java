package week11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Homework11 {
    public static void main(String[] args) {

        Map<Map<String, Integer>, Integer> test = new HashMap<Map<String, Integer>, Integer>();
        HashMap<String, Integer> test2 = new HashMap<String, Integer>();

        test2.put("a", 2);
        test.put(test2, 3);

        System.out.println(test);

    }


//    public static void main(String[] args) {
//        Map<String, Integer> test = new HashMap<String, Integer>();
//        test.put("A", 1);
//        test.put("B", 2);
//        test.put("A", 2);
//        test.put("C", 3);
//
//        System.out.println(test);
//
//        Set<String> keyset = test.keySet();
//        for (String key : keyset) {
//            System.out.println("key is " + key + " value is " + test.get(key));
//            test.get("A");
//        }
//
//    }
}
