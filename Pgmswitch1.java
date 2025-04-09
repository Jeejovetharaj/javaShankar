import java.util.Scanner;
class Pgmswitch1
{
	public static void main(String ar[])
	{
		Scanner s=new Scanner(System.in);
		int num1=s.nextInt();
		int num2=s.nextInt();
		char ch=s.next().charAt(0);
		int ans=0;
		switch(ch)
		{
			case '+':ans=num1+num2;
					 break;
			case '-':ans=num1-num2;
					 break;
			case '*':ans=num1*num2;
			         
					 break;
			case '/':ans=num1/num2;
					 break;
		}
		System.out.print(ans);
		
	}
}