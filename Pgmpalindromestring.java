import java.util.Scanner;
public class Pgmpalindromestring 
{
    static void palindrome(String a)
    {
        int n=a.length();//O(n)
        int i=0;
        int j=n-1;
        while(i<j)
        {
            if(a.charAt(i)!=a.charAt(j))
            {
                System.out.println("No");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Yes");
    }

    public static void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        palindrome(str);
        s.close();
    }
    
}
