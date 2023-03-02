package Counter;

public class WordCounter {

    private  String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void numbersOfWords() {
        text = text.replaceAll("\\W", " ").replaceAll("\\s{2,}", " ");
        String[] words = text.split(" ");
        System.out.println(words.length);
    }
    public void display() {
        System.out.println(getText());
        numbersOfWords();
    }
}
