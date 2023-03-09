package Counter;

import java.util.*;

public class WordCounter {

    private final String text;
    private final String[] formatText;
    private final String numbersOfWords;
    private final String numbersOfUniqueWords;
    private final Map<String, Integer> numbersOfAnyUniqueWords;
    private final String sortedByKey;
    private final String sortedByValue;

    public WordCounter(String text) {
        this.text = text;
        this.formatText = formatText();
        this.numbersOfWords = numbersOfWords();
        this.numbersOfUniqueWords = numbersOfUniqueWords();
        this.numbersOfAnyUniqueWords = numbersOfAnyUniqueWords();
        this.sortedByValue = sortByValue();
        this.sortedByKey = sortByKey();
    }

    public String[] formatText() {
        String stringToFormat = text.toLowerCase().replaceAll("[\\W\\d]", " ").replaceAll("\\s{2,}", " ");
        return stringToFormat.split(" ");
    }

    public String numbersOfWords() {
        return Integer.toString(formatText.length);
    }

    public String numbersOfUniqueWords() {
        HashSet<String> uniqueWords = new HashSet<>();
        Collections.addAll(uniqueWords, formatText);
        return Integer.toString(uniqueWords.size());
    }

    public Map<String, Integer> numbersOfAnyUniqueWords() {
        Map<String, Integer> uniqueWordsNumbers = new HashMap<>();
        for (String value : formatText) {
            if (!uniqueWordsNumbers.containsKey(value)) {
                uniqueWordsNumbers.put(value, 1);
            } else {
                uniqueWordsNumbers.replace(value, uniqueWordsNumbers.get(value) + 1);
            }
        }
        return uniqueWordsNumbers;
    }

    public String sortByValue() {
        StringBuilder mapAsString = new StringBuilder();
        Map<String, Integer> sorted = new HashMap<>(numbersOfAnyUniqueWords);
        sorted.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(v->mapAsString.append(v).append("\n"));
        return mapAsString.toString();
    }
    public String sortByKey() {
        StringBuilder mapAsString = new StringBuilder();
        Map<String, Integer> sorted = new HashMap<>(numbersOfAnyUniqueWords);
        sorted.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(k->mapAsString.append(k).append("\n"));
        return mapAsString.toString();
    }

    public String mapToString() {
        StringBuilder mapAsString = new StringBuilder();
        for (String key: numbersOfAnyUniqueWords.keySet()) {
            mapAsString.append(key).append(" ").append(numbersOfAnyUniqueWords.get(key)).append("\n");
        }
        return mapAsString.toString();
    }

    public String displayToString() {
        String display;
        display = "This text has " + numbersOfWords + " words\n";
        display += "This text has " + numbersOfUniqueWords + " unique words\n\n";
        display += sortedByValue;
        //display += sortedByKey;
        return display;
    }
}
