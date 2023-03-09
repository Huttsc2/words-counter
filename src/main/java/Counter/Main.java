package Counter;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        FileWriterReader fileWriterReader = new FileWriterReader();
        fileWriterReader.WriteToLog();
        fileWriterReader.ReadLog();
        //todo choose type of sort
        //todo choose file
        //todo separate file to new method
    }
}
