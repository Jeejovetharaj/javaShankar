import java.util.Scanner;
class Pgmcircle
{
	public static void main(String a[])
	{
		Scanner sc=new Scanner(System.in);
		int radius = sc.nextInt();
		int area=3.14 * radius *radius;
		System.out.print(area);
	}
}
