package week10;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

    private LinkedList<String> theQueue;

    public MyQueue() {
        this.theQueue = new LinkedList<>();
    }

    public void enqueue(String item) {
        theQueue.add(item);
    }

    public String dequeue() {
        String out = " ";
        if (theQueue.size() > 0)
        {
            out = theQueue.remove();
        }
        return out;
    }

    public String peek() {
        String out = theQueue.get(0);
        return out;
    }

    public int size() {
        return theQueue.size();
    }

    public String toString() {
        String out = "";
            out = out + theQueue + " ";

        return out;
    }


    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue("I");
        q.enqueue("am");
        q.enqueue("not");
        q.dequeue();
        q.enqueue("fine");
        String x = q.peek(); //should be am
        q.enqueue("how");
        q.enqueue("are");
        q.dequeue();
        q.enqueue("you");
        String y = q.dequeue();  //should be not
        // q shoudl be fine how are you
        System.out.println("x: " + x + " y: " + y + " q: " + q);

    }
}
