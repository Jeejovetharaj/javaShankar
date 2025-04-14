import java.util.Scanner;
class Pgmsumnatural
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		int shankar=1;
		for(;shankar<=n;)
		{
			sum=sum+shankar;
			shankar++;
		}
		System.out.print(sum);
	}
}