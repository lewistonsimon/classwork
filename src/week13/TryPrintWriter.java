package week13;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class TryPrintWriter {

    public static void processFile(String filename) {
        try {
            File file = new File(filename);
            Scanner input = new Scanner(file);
            List<String> lst = new ArrayList<>();
            while (input.hasNext()) {
                String temp = input.nextLine();
                lst.add(temp.toUpperCase());
            }
            input.close();
            PrintWriter out = new PrintWriter(filename);
            for (String item : lst) {
                out.println(item);
            }
            out.close();
        } catch (IOException e) {
            System.out.println("OOPS");
        }
    }

    public static void main(String[] args) {
        processFile("test.txt");
    }
}
