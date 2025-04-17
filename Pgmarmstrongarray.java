import java.util.Scanner;
class Pgmarmstrongarray
{
	static int count(int n)
	{
		int c=0;
		while(n!=0)
		{
			n=n/10;
			c++;
		}
		return c;
	}
	static int power(int a,int b)
	{
		int s=1;
		for(int i=1;i<=b;i++)
			s=s*a;
		return s;
	}
	static int armstrong(int n)
	{
		int c=count(n);
		int s=0;
		int dup=n;
		while(n!=0)
		{
			int r=n%10;
			s=s+power(r,c);
			n=n/10;
		}
		if(dup==s)
			return 1;
		else
			return 0;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		for(int i=0;i<n;i++)
			if(armstrong(arr[i])==1)
				System.out.print(arr[i]+" ");
	}
}