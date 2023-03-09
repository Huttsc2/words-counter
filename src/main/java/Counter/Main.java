package Counter;

import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileWriterReader fileWriterReader = new FileWriterReader();
        fileWriterReader.WriteToLog();
        fileWriterReader.ReadLog();
    }
}
