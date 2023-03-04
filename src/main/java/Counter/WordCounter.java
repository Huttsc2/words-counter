package Counter;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class WordCounter {

    private  String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void numbersOfWords() {
        String[] words = formatText();
        System.out.println("This text has " + words.length + " words");
    }
    public void numbersOfUniqueWords() {
        String[] words = formatText();
        HashSet<String> uniqueWords = new HashSet<>();
        Collections.addAll(uniqueWords, words);
        System.out.println("This text has " + uniqueWords.size() + " unique words");

    }
    public String[] formatText() {
        String stringToFormat = text.toLowerCase().replaceAll("\\W", " ").replaceAll("\\s{2,}", " ");
        return stringToFormat.split(" ");
    }
    public void numbersOfAnyUniqueWords() {
        String[] words = formatText();
        Map<String, Integer> uniqueWordsNumbers = new HashMap<>();
        for (String value : words) {
            if (!uniqueWordsNumbers.containsKey(value)) {
                uniqueWordsNumbers.put(value, 1);
            } else {
                uniqueWordsNumbers.replace(value, uniqueWordsNumbers.get(value) + 1);
            }
        }
        for (String key: uniqueWordsNumbers.keySet()) {
            System.out.println(key + ": " + uniqueWordsNumbers.get(key));
        }
    }
    public void display() {
        System.out.println(getText());
        System.out.println();
        numbersOfWords();
        numbersOfUniqueWords();
        numbersOfAnyUniqueWords();
    }
}
