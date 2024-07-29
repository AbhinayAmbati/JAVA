import java.util.Scanner;
public class ArmstrongNumber 
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner (System.in);
        int n = read.nextInt();
        int x=n;
        int z=n;
        int c=0;
        while(n>0)
        {
            n=n/10;
            c++;
        }
        int r,sum=0;
        while(x>0)
        {
            r=x%10;
            sum=sum+(int)Math.pow(r,c);
            x=x/10;
        }
        if(sum==z)
        {
            System.out.println("The given number is Armstrong");
        }
        else
        {
            System.out.println("The given number is not Armstrong");
        }
        read.close();   
    }
    
}
