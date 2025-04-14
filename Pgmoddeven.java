import java.util.Scanner;
class Pgmoddeven
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n%2==0)
			System.out.print("Even");
		else
		{
			System.out.print("Odd");
		}
	}
}