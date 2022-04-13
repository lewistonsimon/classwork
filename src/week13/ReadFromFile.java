package week13;

// upload good code from moodle

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {

    public static void main(String[] args) throws IOException {
        // Try reading from a file
        File reader = new File("test1.txt");
        Scanner in = new Scanner(reader);
        String word = "";

        while(in.hasNext()) {
            word = in.next();
            System.out.println(word);
        }
        in.close();
    }
}