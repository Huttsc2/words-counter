package Counter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        WordCounter wordCounter = new WordCounter();
        Scanner scanner = new Scanner(new File("text.txt"));
        String text = scanner.useDelimiter("\\A").next();
        wordCounter.setText(text);
        wordCounter.display();
        //todo output words and their numbers
    }
}
