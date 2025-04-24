import java.util.Scanner;
class PgmreverseString
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int n=str.length();
		String r="";
		for(int i=n-1;i>=0;i--)
		{
			r=r+str.charAt(i);
			System.out.println(r);
		}
				
	}
}