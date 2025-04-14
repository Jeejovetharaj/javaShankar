import java.util.Scanner;
class Pgmautomorphic
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
	static int square(int a)
	{
		int sum=a*a;
		int c=count(a);
		if(a==sum%power(10,c))
			return 1;
		else
			return 0;
			
	}
	public static void main(String args[])
	{
	Scanner x=new Scanner(System.in);
	int a=x.nextInt();
	if(square(a)==1)
			System.out.print("Yes");
		else
			System.out.print("No");
	}
}