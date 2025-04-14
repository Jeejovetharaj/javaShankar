import java.util.Scanner;
class Pgmsumofoddeven18_1
{
	public static void main(String arg[])
	{
		Scanner x=new Scanner(System.in);
		int a=x.nextInt();
		int sum1=0;
		int sum2=0;
		for(int i=1;i<=2*a;i++)
		{
			if(i%2==1)
				sum1=sum1+i;
			else
				sum2=sum2+i;
		}
			
		System.out.println(sum1+" "+sum2);
		
	}
}