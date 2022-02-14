package week6;

public class BookTester {

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter",
                20.20, "JK Rawlings");
        System.out.println(book1);
        book1.priceChange(10.10);
        System.out.println(book1.returnPrice());
    }
}
