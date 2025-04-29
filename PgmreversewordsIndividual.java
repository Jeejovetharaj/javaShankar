import java.util.Scanner;

public class PgmreversewordsIndividual
{
    static void reverseWords(String a)
    {
        int n=a.length();
        int i=0,j=0;
        String r="";
        for(;i<=n;i++)
        {
            if(i==n || a.charAt(i)==' ')
            {
                for(int k=i-1;k>=j;k--)
                {
                    r=r+a.charAt((k));
                }
                r=r+' ';
                j=i+1;
            }
        }
        System.out.println(r);
    }
    public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        reverseWords(str);
    }
}
