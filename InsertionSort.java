import java.util.Scanner;
public class InsertionSort 
{
    public static void main(String[] args)
    {
        Scanner read = new Scanner (System.in);
        int n = read.nextInt();
        int [] a = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]= read.nextInt();
        }
        int temp,j;
        for(int i=0;i<n;i++)
        {
            temp=a[i];
            j=i-1;
            while(j>=0 && a[j]>temp)
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        read.close();
    }
    
}
