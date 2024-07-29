import java.io.File;
import java.util.Scanner;

public class Files 
{
    public static void main(String[] args)throws Exception
    {
        File f = new File("C:\\Users\\Files.txt");
        Scanner read = new Scanner(f);
        while(read.hasNextLine())
        {
            int a=read.nextInt();
            int b=read.nextInt();
            int c=a+b;
            System.out.println(c);
        }
        read.close();
    }
    
}
