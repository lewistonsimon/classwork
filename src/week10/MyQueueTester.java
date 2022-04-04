package week10;

import java.lang.reflect.Array;

public class MyQueueTester {
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue("hey");
        q.enqueue("how");
        q.enqueue("hey");

        System.out.println(q);
    }
}
