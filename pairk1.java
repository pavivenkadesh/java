import java.util.*;
import java.lang.*;
import java.io.*;


 class pairk1
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc=new Scanner(System.in);
		int cnt=0;
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			if(a[i]+a[j]==k && i!=j)
			{
				cnt=1;
				break;
			}
			}
		}
		if(cnt==1)
		System.out.print("yes");
		else
		System.out.print("no");
	}
}