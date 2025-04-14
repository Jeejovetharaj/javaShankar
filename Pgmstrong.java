import java.util.Scanner;
class Pgmstrong
{
	static boolean strong(int n)
	{
		int s=0;
		int dup=n;
		while(n>0)
		{
			int r=n%10;
			int f=1;
			for(int i=1;i<=r;i++)
				f=f*i;
			s=s+f;
			n/=10;
		}
		if (dup==s)
			return true;
		else
			return false;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		if(strong(n))
			System.out.print("Strong");
		else
			System.out.print("Not Strong");
	}
}
