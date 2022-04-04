package week10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class HomeworkTen {
    public static List postiveNumbers(List numbers) {
        ListIterator<Integer> iter = numbers.listIterator();
        while (iter.hasNext()) {
            if (iter.next() < 0)
            {
                iter.remove();
            }

        }
        return numbers;
    }

    public static List<Integer> createList(int length) {
        List<Integer> largeList = new ArrayList<>();
        //List<Integer> largeList = new LinkedList<>();
        for (int i = 0; i < length; i++) {
            largeList.add((int) (length * Math.random() - length + 5));
        }
        return largeList;
    }


    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        List<Integer> otherList = new LinkedList<>();
        myList.add(9);
        myList.add(-3);
        myList.add(18);
        myList.add(-33);
        myList.add(-303);
        myList.add(-333);
        myList.add(133);
        myList.add(23);
        myList.add(1);

        otherList.add(9);
        otherList.add(-3);
        otherList.add(18);
        otherList.add(-33);
        otherList.add(-303);
        otherList.add(-333);
        otherList.add(133);
        otherList.add(23);
        otherList.add(1);
        System.out.println("Array List is " + postiveNumbers(myList));
        System.out.println();
        System.out.println("Linked List is " + postiveNumbers(otherList));
        System.out.println("-------------------------------");
//        System.out.println(createList(200));
        System.out.println("Large Array List is " + postiveNumbers(createList(20000)));
        System.out.println();
        System.out.println("Large Linked List is " + postiveNumbers(createList(20000)));
    }
}

