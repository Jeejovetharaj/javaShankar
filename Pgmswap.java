import java.util.Scanner;
class Pgmswap
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int t=a;
		a=b;
		b=t;
		System.out.print("Swapped value:"+a+" "+b);
	}
}