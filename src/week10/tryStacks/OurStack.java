package week10.tryStacks;

import java.util.Arrays;

public class OurStack {

    //LIFO last in first out - def of stacks

    private static final int DEFAULT_CAPACITY = 10;
    private String[] elements;
    private int size;

    public OurStack() {
        elements = new String[DEFAULT_CAPACITY];
        size = 0;
    }

    public void push(String item) {
        if (size >= DEFAULT_CAPACITY)
        {
            increaseCapacity();
        }
            elements[size] = item;
            size++;

    }

    public String pop() {
        String top = "";
        if (size > 0)
        {
            top = elements[size - 1];
            size--;
        }
        return top;
    }

    public String peek() {
        String top = "";
        if (size > 0)
        {
            top = elements[size - 1];
        }
        return top;
    }

    private void increaseCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public String toString() {
        String out = "";
        for (int count = size - 1; count >= 0; count--) {
            out = out +  elements[count] + " ";
        }
        return out;
    }

}

