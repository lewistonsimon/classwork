package week10.tryQueues;

import java.util.Arrays;

public class CircularQueue { // FIFO first in first out

    private static final int CAPACITY = 5;
    private int head;
    private int tail;
    private String[] theQueue;
    private int count = 0;

    public CircularQueue()
    {
        head = 0;  //spot to be removed next
        tail = 0;  //first empty spot
        count = 0;
        theQueue = new String[CAPACITY];
    }

    public void enqueue(String item)
    {
        if (count < CAPACITY)
        {
            theQueue[tail] = item;
            count++;
            if (tail < CAPACITY - 1) {
                tail++;
            } else {
                tail = 0;
            }
        } else {
            System.out.println("It's full");
        }

    }


    public String dequeue()
    {
        String out = "";
        if (count > 0)
        {
            out = theQueue[head];
            count--;
            if (head < CAPACITY - 1)
            {
                head++;
            } else {
                head = 0;
            }
        }
        return out;
    }

    public String peek()
    {
        String out = "";
        if (count > 0)
        {
            out = theQueue[head];
        }
        return out;
    }


    public void justArray(){
        System.out.println(Arrays.toString(theQueue));
    }

    public String toString()
    {
        String out = "";
        for (int i = 0; i < count; i++)

            out = out + theQueue[(head + i) % CAPACITY] + " ";

        return out;
    }
}

