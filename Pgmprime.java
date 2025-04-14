import java.util.Scanner;
class Pgmprime
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				c++;
				break;
			}
		}
		if(c==0 && n>1)
			System.out.print("Yes");
		else
			System.out.print("No");
	}
}