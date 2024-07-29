import java.util.Scanner;
public class PalindromeNumber 
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner (System.in);
        int n  = read.nextInt();
        int x=n;
        int r,sum=0;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(sum==x)
        {
            System.out.println("The given number is palindrome");
        }
        else
        {
            System.out.println("The given number is not palindrome");
        }
        read.close();
    }
    
}
