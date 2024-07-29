import java.util.Scanner;            
import java.io.*;            
public class F3
{            
public static void main(String args[])throws Exception{            
FileWriter fw=new FileWriter("C:\\Users\\asus\\OneDrive\\Documents\\Java\\Java\\src\\f3.txt",true);            
            
  Scanner s=new Scanner(System.in);          
  int sno;          
  String sname;          
  System.out.println("enter sno,sname");          
  sno=s.nextInt();          
  s.nextLine();          
  sname=s.next();          
  fw.write("\n"+sno+" "+sname);          
  fw.close();          
  }          
}
