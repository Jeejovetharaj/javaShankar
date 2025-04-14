import java.util.Scanner;
class Pgmswitch
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a)
		{
			case 1:				 
			case 2:				   
			case 3:System.out.print("Tuesday");
				   break;
			case 6:System.out.print("Friday");
				   break;
			case 7:System.out.print("Saturday");
				   break;
			case 5:System.out.print("Thursday");
				   break;
			case 4:System.out.print("Wednesday");
				   break;
			default: System.out.print("Enter 1 - 7");
		}
		
	}
}