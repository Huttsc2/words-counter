package Counter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        WordCounter wordCounter = new WordCounter();
        System.out.println("Enter the text");
        wordCounter.setText(sc.nextLine());
        System.out.println(wordCounter.getText());
        wordCounter.numbersOfWords();
    }
}
