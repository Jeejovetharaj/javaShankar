import java.util.Scanner;
class Pgmfibonacci
{
	public static void main(String arg[])
	{
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int a=0,b=1;
		for(int i=1;i<=n;i++)
		{
			System.out.print(a+" ");
			int c=a+b;
			a=b;
			b=c;
		}
	}
}