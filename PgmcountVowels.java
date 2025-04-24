import java.util.Scanner;
class PgmcountVowels
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int n=str.length();
		int c=0;
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e'||str.charAt(i)=='A'|| str.charAt(i)=='E'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='u'||str.charAt(i)=='U')
			{
				c++;
			}
		}
		System.out.print(c);
				
	}
}