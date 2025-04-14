import java.util.Scanner;
class Pgmcountdigit
{
	public static void main(String arg[])
	{
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int c=0;
		while(n!=0)
		{
			n=n/10;
			c++;
		}
		System.out.print(c);
	}
}