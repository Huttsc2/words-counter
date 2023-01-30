import java.io.*;
public class FileCheck {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\SicSI\\Downloads\\Telegram Desktop\\20220717_162340.jpg");
        try (FileWriter writer = new FileWriter("C:\\Users\\SicSI\\Pictures\\123\\text.txt", false)) {
            writer.write("File name : " + file.getName());
            writer.append('\n');
            writer.write("Path : " + file.getPath());
            writer.append('\n');
            writer.write("Absolute path :" + file.getAbsolutePath());
            writer.append('\n');
            writer.write("Parent :" + file.getParent());
            writer.append('\n');
            writer.write("Exists :" + file.exists());
            writer.append('\n');
            if (file.exists()) {
                writer.write("Is writable: " + file.canWrite());
                writer.append('\n');
                writer.write("Is readable: " + file.canRead());
                writer.append('\n');
                writer.write("Is a directory: " + file.isDirectory());
                writer.append('\n');
                writer.write("File Size in bytes: " + file.length());
                writer.append('\n');
            }
            writer.flush();
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        try (FileReader reader = new FileReader("C:\\Users\\SicSI\\Pictures\\123\\text.txt")) {
            int c;
            while ((c=reader.read())!=-1) {
                System.out.print((char)c);
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
