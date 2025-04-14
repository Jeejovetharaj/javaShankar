import java.util.Scanner;
class Pgmsumdigit
{
	public static void main(String arg[])
	{
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int s=0;
		while(n!=0)
		{
			s+=n%10;
			n/=10;//shorthand operator
		}
		System.out.print(s);
	}
}