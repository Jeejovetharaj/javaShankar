import java.util.Scanner;

public class Pgmreversewords 
{
    static void reverseWords(String a)
    {
        int n=a.length();
        int i=n-1,j=n-1;
        String r="";
        for(;i>=0;i--)
        {
            if(a.charAt(i)==' ')
            {
                for(int k=i+1;k<=j;k++)
                {
                    r=r+a.charAt((k));
                }
                r=r+' ';
                j=i-1;
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
