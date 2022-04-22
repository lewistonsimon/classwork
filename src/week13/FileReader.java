package week13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public static void countTheCharacters(File text) throws FileNotFoundException {
        File reader = text;
        Scanner in = new Scanner(reader);
        ArrayList<String> countList = new ArrayList<>();
        String word = " ";


        while (in.hasNextLine()) {
            word = in.nextLine();
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) != ' ')
                {
                    count++;
                }
            }
            word += " " + count;
            countList.add(word);
        }
        in.close();

        PrintWriter temp = new PrintWriter(text);

        for (int j = 0; j < countList.size(); j++) {
            temp.println(countList.get(j));
        }
        temp.close(); // this is very important, remember to close the file
    }

    public static void main(String[] args) throws FileNotFoundException {
        countTheCharacters(new File("test.txt"));
    }
}
