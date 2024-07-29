import java.util.Scanner;
public class BinarySearch 
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner (System.in);
        int  n = read.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=read.nextInt();
        }
        int key = read.nextInt();
        int mid,low=0,high=n-1,c=0;
        while(low<high)
        {
            mid=(low+high)/2;
            if(a[mid]==key)
            {
                c++;
                break;
            }
            else if(a[mid]<key)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
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
