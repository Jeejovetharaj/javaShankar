import java.util.Scanner;
class Pgmmissingarray
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		
		for(int j=0;j<n-1;j++)
		{
			for(int i=0;i<n-1;i++)
			{
				if(arr[i]>arr[i+1])
				{
					int t=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=t;
				}
			}
		}
		
		for(int i=0;i<n;i++)
		{
			if(arr[i+1]-arr[i]!=1)
			{
				System.out.print(arr[i]+1);
				break;
			}
		}
		
	}
}