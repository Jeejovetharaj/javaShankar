import java.util.Scanner;
import java.lang.*;

public class Pgmstringmethod
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str="abinaya";
        String r="";
        for(int i=0;i<str.length();i++)
        {
            r=r+(char)(str.charAt(i)-32);
        }
        System.out.println((r));
    }
}
