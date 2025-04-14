import java.util.Scanner;
class Pgmdivisor_method
{
	public static void divisor(int a)
	{
		if (a%5==0 && a%7==0)
			System.out.print("Yes");
		else
			System.out.print("No");
	}
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		divisor(a);//method call	
	}
}