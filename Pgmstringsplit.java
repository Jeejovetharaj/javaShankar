import java.util.Scanner;
import java.lang.*;

public class Pgmstringsplit 
{
    static void reverseWords(String str) 
    {
        String a[]=str.split(" ");
        int n=a.length;
        int i=0,j=n-1;
        while(i<j)
        {
            String t=a[i];
            a[i]=a[j];
            a[j]=t;
            i++;
            j--;
        }
        str=String.join(" ",a);
        System.out.println(str);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        reverseWords(str);

    }

    

}
