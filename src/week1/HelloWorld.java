package week1;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello");
        int number;
        number = 1;
        System.out.println("the number is " + number);
        char myCharacter = 'c';
        String myStr = "This is a string.";

//      if you put print it will show up on the same line.
        // the println will make the next print on a new line
        System.out.print("hi this is a string");
        System.out.println("here is another");

        String name;	// Declare variable
        name = "Bob";	// Initialize variable
        System.out.println("Hello, " + name + "!");
        name = "What about " + name + "?";
        // Don't declare variables more than once.
        System.out.println(name);

        System.out.println(number++);  // adds after it prints
        System.out.println(++number); // adds before it prints
        System.out.println(number);


    }
}
