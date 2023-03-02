import java.io.BufferedReader;
import java.io.FileReader;
import java.io.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class ReadTxt {
    /*private static String method(String filePath)
    {
        StringBuilder builder = new StringBuilder();
        try (BufferedReader buffer = new BufferedReader(new FileReader(filePath))) {
            String str;
            while ((str = buffer.readLine()) != null) {
                builder.append(str).append("\n");
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();
    }
    public static void main(String[] args) {
        String filePath = "C:\\dev\\words-counter\\text.txt";
        String string = method(filePath);
        System.out.println(string);
    }*/
    /*public static void main(String[] args) throws IOException {

        // Creating a path choosing file from local
        // directory by creating an object of Path class
        Path fileName = Path.of("C:\\dev\\words-counter\\text.txt");

        // Now calling Files.readString() method to
        // read the file
        String str = Files.readString(fileName);

        // Printing the string
        System.out.println(str);
    }*/
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("text.txt"));
        String text = scanner.useDelimiter("\\A").next();
        System.out.println(text);
    }
}
