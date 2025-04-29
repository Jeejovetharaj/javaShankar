import java.util.Scanner;
class Missing
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();

        int a[]=new int[26];

        for(int i=0;i<str.length();i++)
        {
            a[str.charAt(i)-'a']=1;
        }
        for(int i=0;i<26;i++)
        {
            if(a[i]==0)
            {
                System.out.print((char)(i+97));
            }
        }
    }
}