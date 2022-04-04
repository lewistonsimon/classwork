package week12;

public class Node<T> { //Generic Node

    //instance variables
    private T value;
    private Node<T> nextNode;

    //constructor
    public Node(T value) {
        this.value = value;
        nextNode = null;
    }

    //other methods
    public void setLink(Node newNode) {
        newNode = newNode;
    }


    public T getValue() {
        return value;
    }

    //return the node
    public Node<T> getLink() {
        return nextNode;
    }

    //toString
    public String toString() {
        return "" + value;
    }



}
