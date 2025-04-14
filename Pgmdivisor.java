import java.util.Scanner;
class Pgmdivisor
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		
		if (a%35==0)
			System.out.print("Yes");
		else
			System.out.print("No");
	}
}