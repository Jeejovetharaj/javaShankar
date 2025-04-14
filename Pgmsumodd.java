import java.util.Scanner;
class Pgmsumodd
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=2*n-1;i=i+2)
		{
			sum=sum+i;
		}
		System.out.print(sum);
	}
}