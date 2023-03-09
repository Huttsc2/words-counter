package Counter;

import java.io.*;
import java.util.Scanner;

public class FileWriterReader {
    String toRead;
    String toWrite;
    String fileText;

    public FileWriterReader() throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        this.toRead = sc.nextLine();
        this.toWrite = "log.txt";
        this.fileText = fileToString();
    }
    public String fileToString() throws FileNotFoundException {
        Scanner sc = new Scanner(new File(toRead));
        return sc.useDelimiter("\\A").next();
    }
    public void WriteToLog() throws FileNotFoundException {
        WordCounter wordCounter = new WordCounter(fileToString());
        try (FileWriter log = new FileWriter(toWrite)) {
            log.write(wordCounter.displayToString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void ReadLog() {
        try (FileReader readLog = new FileReader(toWrite)) {
            int c;
            while ((c=readLog.read())!=-1) {
                System.out.print((char)c);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
