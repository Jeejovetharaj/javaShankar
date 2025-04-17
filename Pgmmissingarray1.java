import java.util.Scanner;
class Pgmmissingarray1
{
	static void missingNumber(int n,int a[])
	{
		int max=a[0],min=a[0];
		for(int i=1;i<n;i++)
		{
			if(a[i]>max)
				max=a[i];
			else if(a[i]<min)
				min=a[i];
		}
		int b[]=new int[max+1];
		for(int i=0;i<n;i++)
		{
			b[a[i]]=1;
		}
		for(int i=min;i<=max;i++)
		{
			if(b[i]==0)
			{
				System.out.print(i);
				return;
			}
		}
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		missingNumber(n,arr);
	}
}