package Counter;

import java.util.*;

public class WordCounter {

    private final String text;
    private final String[] formatText;
    private final String numbersOfWords;
    private final String numbersOfUniqueWords;
    private final Map<String, Integer> numbersOfAnyUniqueWords;
    private ArrayList<String> mapKeysToArray;

    public void setMapKeysToArray(ArrayList<String> mapKeysToArray) {
        this.mapKeysToArray = mapKeysToArray;
    }

    public WordCounter(String text) {
        this.text = text;
        this.formatText = formatText();
        this.numbersOfWords = numbersOfWords();
        this.numbersOfUniqueWords = numbersOfUniqueWords();
        this.numbersOfAnyUniqueWords = numbersOfAnyUniqueWords();
        this.mapKeysToArray = mapKeysToArray();
    }

    public String[] formatText() {
        String stringToFormat = text.toLowerCase().replaceAll("\\W", " ").replaceAll("\\s{2,}", " ");
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

    public ArrayList<String> mapKeysToArray() {
        return new ArrayList<>(numbersOfAnyUniqueWords.keySet());
    }

    public void sortByNumbers() {
        ArrayList<String> sorted = mapKeysToArray;
        boolean is_sort = false;
        while (!is_sort) {
            is_sort = true;
            for (int i = 1; i < sorted.size(); i++) {
                if (numbersOfAnyUniqueWords.get(sorted.get(i-1)) < numbersOfAnyUniqueWords.get(sorted.get(i))) {
                    sorted.add(i-1, sorted.remove(i));
                    is_sort = false;
                    break;
                }
            }
        }
        setMapKeysToArray(sorted);
    }

    public String mapToString() {
        StringBuilder mapAsString = new StringBuilder();
        for (String key: mapKeysToArray) {
            mapAsString.append(key).append(" ").append(numbersOfAnyUniqueWords.get(key)).append("\n");
        }
        return mapAsString.toString();
    }

    public void display() {
        System.out.println("This text has " + numbersOfWords + " words");
        System.out.println("This text has " + numbersOfUniqueWords + " unique words");
        System.out.println(mapToString());
    }

    public String displayToString() {
        String display;
        display = "This text has " + numbersOfWords + " words\n";
        display += "This text has " + numbersOfUniqueWords + " unique words\n\n";
        sortByNumbers();
        display += mapToString();
        return display;
    }
}
