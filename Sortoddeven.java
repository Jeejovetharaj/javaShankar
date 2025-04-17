import java.util.Scanner;
class Sortoddeven
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		
		for(int i=1;i<n;i++)
			if(arr[i]/2==0)
			{
		int t=arr[0];
		for(int i=1;i<n;i++)
			arr[i-1]=arr[i];
		arr[n-1]=t;
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
			}
			else
			{
		int t=arr[n-1];
		for(int i=n-2;i>=0;i--)
			arr[i+1]=arr[i];
		arr[0]=t;
		
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
			}
		
	