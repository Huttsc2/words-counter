package Counter;

import java.util.Collections;
import java.util.HashSet;

public class WordCounter {

    private  String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    public String formatText() {
        return text.toLowerCase().replaceAll("\\W", " ").replaceAll("\\s{2,}", " ");
    }

    public void numbersOfWords() {
        String textToCount = formatText();
        String[] words = textToCount.split(" ");
        System.out.println("This text has " + words.length + " words");
    }
    public void numbersOfUniqueWords() {
        String textToCount = formatText();
        String[] words = textToCount.split(" ");
        HashSet<String> uniqueWords = new HashSet<>();
        Collections.addAll(uniqueWords, words);
        System.out.println("This text has " + uniqueWords.size() + " unique words");

    }
    public void display() {
        System.out.println(getText());
        System.out.println();
        numbersOfWords();
        numbersOfUniqueWords();
    }
}
