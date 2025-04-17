import java.util.Scanner;
class Pgmarrayprime
{
	static boolean isPrime(int n)
	{
		int c=0;
		for( int i=2;i<=n/2;i++)
			if(n%i==0)
			{
				c++;
				break;
			}
		if(c==0)
			return true;
		else
			return false;
			
	}
	static void nonPrime(int n,int a[])
	{
		for(int i=0;i<n;i++)
		{
			if(isPrime(a[i])==false)
				System.out.print(a[i]+" ");
		}
		
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		nonPrime(n,arr);
	}
}
		
		