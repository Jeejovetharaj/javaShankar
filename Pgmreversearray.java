import java.util.Scanner;
class Pgmreversearray
{
	static void reverse(int a[])
	{
		int n=a.length;//6
		int i=0,j=n-1;
		while(i<j)
		{
			int t=a[i];
			a[i]=a[j];
			a[j]=t;
			i++;
			j--;
		}
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		reverse(arr);
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
	}
}