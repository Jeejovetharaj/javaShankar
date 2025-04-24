import java.util.Scanner;
class PgmcountCOnsnants
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int n=str.length();
		int c=0;
		for(int i=0;i<n;i++)
		{
			char x=str.charAt(i);
			if((x>='a' && x<='z')&& !(x=='a' || x=='e' ||x=='i'||x=='o'||x=='u'))
			{
				c++;
			}
		}
		System.out.print(c);
	}
}