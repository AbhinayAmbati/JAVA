import java.util.Scanner;
public class setX_getX 
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int a=read.nextInt();
        int b=read.nextInt();
        int c=read.nextInt();
        set s = new set();
        s.setX(a, b, c);
        s.display();
        read.close();
    }   
}
class set
{
    private int a,b,c;
    public void setX(int a,int b,int c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public int  getX()
    {
        return this.a+this.b+this.c;
    }
    public void display()
    {
        System.out.println(getX());
    }
}
