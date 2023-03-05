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

    public String numbersOfWords() {
        String[] words = formatText();
        return Integer.toString(words.length);
    }
    public String numbersOfUniqueWords() {
        String[] words = formatText();
        HashSet<String> uniqueWords = new HashSet<>();
        Collections.addAll(uniqueWords, words);
        return Integer.toString(uniqueWords.size());
    }
    public String[] formatText() {
        String stringToFormat = text.toLowerCase().replaceAll("\\W", " ").replaceAll("\\s{2,}", " ");
        return stringToFormat.split(" ");
    }
    public String numbersOfAnyUniqueWords() {
        String[] words = formatText();
        StringBuilder mapAsString = new StringBuilder();
        Map<String, Integer> uniqueWordsNumbers = new HashMap<>();
        for (String value : words) {
            if (!uniqueWordsNumbers.containsKey(value)) {
                uniqueWordsNumbers.put(value, 1);
            } else {
                uniqueWordsNumbers.replace(value, uniqueWordsNumbers.get(value) + 1);
            }
        }
        for (String key: uniqueWordsNumbers.keySet()) {
            mapAsString.append(key).append(" ").append(uniqueWordsNumbers.get(key)).append("\n");
        }
        return mapAsString.toString();
    }
    public void display() {
        System.out.println(getText());
        System.out.println();
        System.out.println("This text has " + numbersOfWords() + " words");
        System.out.println("This text has " + numbersOfUniqueWords() + " unique words");
        System.out.println(numbersOfAnyUniqueWords());
    }
    public String displayToString() {
        String display;
        display = "This text has " + numbersOfWords() + " words\n";
        display += "This text has " + numbersOfUniqueWords() + " unique words\n";
        display += numbersOfAnyUniqueWords();
        return display;
    }
}
