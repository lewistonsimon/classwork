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
        if (position >= size()) {
            addNode(value);
        }
        else {
            int index = 0;
            Node currentNode = firstNode;
            Node newNode = new Node(value);
            if (position == 0) {
                newNode.setLink(firstNode);
                firstNode = newNode;
            }
            else {
                while (index < position - 1) {
                    index++;
                    currentNode = currentNode.getLink();
                }
                Node tempNode = currentNode.getLink();
                currentNode.setLink(newNode);
                newNode.setLink(tempNode);
            }
        }
    }

    //Remove
    public void remove(int position) {
        if (position >= size())
        {
            position = size() - 1;
        }
        if (size() > 0)
        {
            if (position <= 0)
            {
                this.firstNode = firstNode.getLink();
            }
            else {
                int index = 0;
                Node currentNode = firstNode;
                while (index < position - 1) {
                    index++;
                    currentNode = currentNode.getLink();
                }
                if (currentNode.getLink() != null)
                {
                    currentNode.setLink(currentNode.getLink().getLink());
                }
                else
                {
                    currentNode.setLink(null);
                }

            }
        }
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
