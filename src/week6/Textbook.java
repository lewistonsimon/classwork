package week6;

import java.util.ArrayList;

public class Textbook extends Book{

    private String subject;
    private ArrayList<String> resources;

    // constructor
    public Textbook(String title, double price, String author,
                    String subject) {
        super(title, price, author);
        this.subject = subject;
        resources = new ArrayList<>();

    }

    public void addResource(String newResource) {
        if (!resources.contains(newResource)) {
            resources.add(newResource);
        }
    }

    @Override
    public void doSomething() {
        System.out.println("In textbook");
    }

    public String toString() {
        return super.toString() + " subject " + subject +
                " resources " + resources;
    }
}
