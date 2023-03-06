package Counter;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        WordCounter wordCounter = new WordCounter();
        Scanner scanner = new Scanner(new File("text.txt"));
        String text = scanner.useDelimiter("\\A").next();
        wordCounter.setText(text);
        try (FileWriter log = new FileWriter("log.txt")) {
            log.write(wordCounter.displayToString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (FileReader readLog = new FileReader("log.txt")) {
            int c;
            while ((c=readLog.read())!=-1) {
                System.out.print((char)c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        //wordCounter.display();
        //todo sort words in AnyUnique by alphabet
        //todo choose file
        //todo separate file to new method
    }
}
