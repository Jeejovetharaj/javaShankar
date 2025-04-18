import java.util.Scanner;
class Pgmpairarray
{
	static void pairs(int a[],int b[])
	{
		int n=a.length;
		int m=b.length;
		int max=a[0],min=a[0];
		for(int i=1;i<n;i++)
		{
			if(a[i]>max)
				max=a[i];
			else if(a[i]<min)
				min=a[i];
		}
		for(int i=0;i<m;i++)
		{
			if(b[i]>max)
				max=b[i];
			else if(b[i]<min)
				min=b[i];
		}
		int c[]=new int[max+1];
		for(int i=0;i<n;i++)
		{
			c[a[i]]++;
		}
		for(int i=0;i<m;i++)
		{
			c[b[i]]++;
		}
		int s=0;
		for(int i=min;i<=max;i++)
			s=s+c[i]/2;
		System.out.print(s);
		
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		
		int m=s.nextInt();
		int arr1[]=new int[m];
		for(int i=0;i<m;i++)
			arr1[i]=s.nextInt();
		
		pairs(arr,arr1);

	}
}