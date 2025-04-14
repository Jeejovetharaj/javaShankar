import java.util.Scanner;
class Pgmfactorial
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=1;
		for(int i=1;i<=n;i++)
		{
			sum=sum*i;
		}
		System.out.print(sum);
	}
}