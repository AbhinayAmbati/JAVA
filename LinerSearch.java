import java.util.Scanner;
public class LinearSearch 
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner (System.in);
        int n = read.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=read.nextInt();
        }
        int key = read.nextInt();
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(key==a[i])
            {
                c++;
                break;
            }
        }
        if(c==1)
        {
            System.out.println("The element is found");
        }
        else
        {
            System.out.println("Element is not found");
        }
        read.close();
    }
    
}
