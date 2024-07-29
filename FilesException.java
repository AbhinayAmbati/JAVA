import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExce{
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("input.txt");
            int data;
            System.out.println("Contents of the file:");
            while ((data = fis.read()) != -1) {
                System.out.print((char) data);
            }
            fis.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Error reading from file.");
        }
    }
}
