package week12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class RemoveDuplicates {

    public static ArrayList<String> deleteRepeatsArrayList(ArrayList<String> test) {
        ArrayList<String> newLst = new ArrayList<>();
        for (String item : test) {
            if (!newLst.contains(item)) {
                newLst.add(item);
            }
        }
        return newLst;
    }

//    public static ArrayList<String> deleteRepeatsHashSet(ArrayList<String> test) {
//        HashSet<String> y = new ArrayList<>(test);
//    }

    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add("hi");
        lst.add("hi");
        lst.add("hi");
        lst.add("hi");
        lst.add("low");
        lst.add("low");
        lst.add("lo");
        lst.add("lo");
        lst.add("HI");
        System.out.println(deleteRepeatsArrayList(lst));
    }
}
