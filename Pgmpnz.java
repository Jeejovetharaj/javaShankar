import java.util.Scanner;
class Pgmpnz
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n>0)
			System.out.print("Positive");
		else if(n==0)
			System.out.print("Zero");
		else
			System.out.print("Negative");
	}
}