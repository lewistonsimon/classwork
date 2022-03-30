package week11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {

    public static void main(String[] args) {
        // First set up a hash set

        Set<String> names = new TreeSet<>();
        names.add("Cory");

        names.add("Bob");
        names.add("Aiden");
        names.add("Drake");
        names.add("Drake");

        System.out.println(names);

		if (names.contains("Bob")) {
			names.remove("Bob");
		}
		System.out.println(names);
////
//////		//Note this is an Iterator and not a ListIterator
		Iterator<String> iterator = names.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
//
////		//Note this no longer exists in the list
//		names.remove("Bob");
//
		for (String element : names) {
			System.out.println(element);
		}

    }

}

//Tree will always be in order
// not true for hash

