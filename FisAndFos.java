import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class F4
{
    public static void main(String[] args)throws IOException
    {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try
        {
            fis=new FileInputStream("C:\\Users\\fis.txt");
            fos= new FileOutputStream("C:\\Users\\fos.txt");
            int c;
            while ((c=fis.read())!=-1) 
            {
                fos.write(c);
                System.out.println((char)c);
                
            }
        }catch(FileNotFoundException fe)
        {
            System.out.println(fe.getClass().getName());
        }
        finally
        {
            fis.close();
            fos.close();               
        }
        
    }   
}
