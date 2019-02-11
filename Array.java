

import java.util.Scanner;

 class Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=1;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			res=1;
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					continue;
				}
				else
				{
					res=res*a[j];
				}
			}
			System.out.print(res+" ");
			sc.close();
		}
	}

}