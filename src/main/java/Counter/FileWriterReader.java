package Counter;

import java.io.*;
import java.util.Scanner;

public class FileWriterReader {
    String toRead;
    String toWrite;
    String fileText;

    public FileWriterReader() throws FileNotFoundException {
        this.toRead = fileURL();
        this.toWrite = "log.txt";
        this.fileText = fileToString();
    }
    public String fileURL() {
        String position;
        System.out.println("\nChoose file:\n1: text.txt\n2: FightCLub.txt");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x) {
            case 1:
                position = "text.txt";
                break;
            case 2:
                position = "FightClub.txt";
                break;
            default:
                position = null;
        }
        return position;
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
