package week12;

public class NodeTester {

//    public static void main(String[] args) {
//        Node<Integer> node1 = new Node<>(222);
//        Node<Integer> node2 = new Node<>(22);
//        node1.setLink(node2);
//        Node<Integer> nextNode = node1;
//        while (nextNode != null) {
//            System.out.println(nextNode + " ");
//            nextNode = nextNode.getLink();
//        }
//    }


    public static void main(String[] args) {
        Node<String> node1 = new Node<>("HI");
        Node<String> node2 = new Node<>("BYe");
        node1.setLink(node2);
        Node<String> nextNode = node1;
        while (nextNode != null) {
            System.out.println(nextNode + " ");
            nextNode = nextNode.getLink();
        }
    }
}
