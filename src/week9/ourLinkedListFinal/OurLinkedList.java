package week9.ourLinkedListFinal;

import week9.ourLinkedListFinal.Node;

public class OurLinkedList {
    //instance variable
    private Node firstNode;


    //Constructor
    public OurLinkedList() {
        firstNode = null;
    }


    //addNode
    public void addNode(int value) {
        //create new Node and then decide where it goes
        Node newNode = new Node(value);
        if (firstNode == null)
        {
            firstNode = newNode;
        }
        else
        {
            Node currentNode = firstNode;
            while (currentNode.getLink() != null) {
                currentNode = currentNode.getLink();
            }
           currentNode.setLink(newNode);
        }


    }

    public int getValue(int position) {
        int index = 0;
        if (size() > position)
        {
            Node currentNode = firstNode;
            while (index < position) {
                index++;
                currentNode = currentNode.getLink();
            }

            return currentNode.getValue();
        }
        else
        {
            return -1;
        }
    }

    public int size() {
        int count = 0;
        Node currentNode = firstNode;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.getLink();
        }
        return count;
    }

    //insert
    public void insert(int position, int value) {

    }

    //Remove
    public void remove(int position) {

    }

    //toString
    public String toString() {
        String out = "";
        Node currentNode = firstNode;
        while (currentNode != null) {
            out = out + currentNode.getValue() + " ";
            currentNode = currentNode.getLink();
        }
        return out;
    }
}

