import java.util.Scanner;
public class Polymorphism 
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int a=read.nextInt();
        int b=read.nextInt();
        int c=read.nextInt();
        poly p = new poly();
        p.sum(a,b,c);
        p.sum(a,b);
        read.close();
    }
}
class poly
{
    public  void sum(int a,int b,int c)
    {
        int res=a+b+c;
        System.out.println(res);
    }
    public void sum(int a,int b)
    {
        int res=a+b;
        System.out.println(res);
    }
}
