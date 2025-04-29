import java.util.Scanner;
class Anagram
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String b=s.nextLine();
        int n=a.length();
        int m=b.length();    
        if(n!=m) 
        {
            System.out.println("No");
            return;
        }   
        int arr[]=new int[26];
        for(int i=0;i<n;i++)
        {
            arr[a.charAt(i)-97]++;
            arr[b.charAt(i)-97]--;
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]!=0)
            {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}