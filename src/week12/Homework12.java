package week12;

import java.util.ArrayList;
import java.util.List;

public class Homework12 {

    public static <E extends Comparable> List<E> Problem3(E[] array, E first, E last) {
        List<E> newList = new ArrayList<>();
        for (E item : array) {
            if (item.compareTo(first) > 0 && item.compareTo(last) < 0) {
                newList.add(item);
            }
        }
        return newList;
    }

    public static void main(String[] args) {
        String[] mylst = {"boy", "cat", "dog", "zebra"};
        Integer[] secondlst = {1,34,4,56,78,2,-345};
        System.out.println(Problem3(secondlst,0,63));
        System.out.println(Problem3(mylst, "apple", "duck"));
    }
}
