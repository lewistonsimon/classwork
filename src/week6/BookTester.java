package week6;

public class BookTester {

    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter",
                20.20, "JK Rawlings");
        System.out.println(book1);
        book1.priceChange(10.10);
        System.out.println(book1);
        Book book2 = new Book("My Antonia", 20.99, "Willa Cather");
        System.out.println(book2);
        book2.priceChange(13.23);
        System.out.println(book2);

        Textbook txtbook1 = new Textbook("Big Java", 150, "Cayman",
                "Computer Science");
        System.out.println(txtbook1);
        txtbook1.addResource("www.book.com");
        txtbook1.addResource("www.book.com");
        txtbook1.addResource("www.info.com");
        System.out.println(txtbook1);

//        Book test = txtbook1;
//        test.doSomething();
    }
}

