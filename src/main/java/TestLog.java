import Counter.WordCounter;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestLog {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new File("text.txt"));
        String text = scanner.useDelimiter("\\A").next();
        WordCounter wordCounter = new WordCounter(text);
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
    }
}
