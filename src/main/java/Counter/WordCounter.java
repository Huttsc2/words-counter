package Counter;

public class WordCounter {

    private  String text;

    private int words;


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getWords() {
        return words;
    }

    public void setWords(int words) {
        this.words = words;
    }

    public void numbersOfWords() {
        text = text.replaceAll("\\W", " ").replaceAll("\\s{2,}", " ");
        String[] words = text.split(" ");
        System.out.println(words.length);
    }
}
