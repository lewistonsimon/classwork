package week6;

public class PersonTester {
    public static void main(String[] args) {
//        Person p1 = new Person("Helen", "555-555-5555", "111 First Street");

        Person p1 = new Employee("Helen", "555-555-5555",
                "111 First Street", "sales person");

        Person p2 = new Customer("John", "777-7777-7777",
                "777 7th Street", "eastern");

        printAddress(p2);

    }

    public static void printAddress(Person person) {
        System.out.println(person.formatAddress());
    }
}
