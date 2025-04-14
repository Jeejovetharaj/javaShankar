import java.util.Scanner;
class Pgmpalindrome
{
	public static void main(String arg[])
	{
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();
		int rev=0;
		int dup=n;
		while(n!=0)
		{
			int r=n%10;
			rev=rev*10+r;
			n/=10;
		}
		//System.out.print(rev+" "+dup);
		if(dup==rev)
			System.out.print("Yes");
		else
			System.out.print("No");
	}
}