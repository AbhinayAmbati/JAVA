
import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(StringReverse[] args)
	{
		Scanner read = new Scanner (System.in);
		int n = read.nextInt();
		int flag=0;
		for(int i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.println("Not a Prime Number");
		}
		else
		{
			System.out.println("Prime Number");
		}
		read.close();
	}
}
