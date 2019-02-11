import java.util.Scanner;
 class tree
{
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt(),m=sc.nextInt(),a[]=new int[n+1],b[]=new int[m+1],c[]=new int [m+1],sum=0;
		for(int i=1;i<=n;i++)
		   a[i]=sc.nextInt();
		for(int i=1;i<=m;i++)
		{
		    b[i]=sc.nextInt();
		    c[i]=sc.nextInt();
		}
		for(int i=1;i<=m;i++)
		{
		    for(int j=b[i];j<=b[i];j++)
		    {
		     sum=a[j]^a[j+1];  
		     for(int k=j+2;k<=c[i];k++)
		     sum=sum^a[k];
		    }
		    System.out.println(sum);
		}
	}
}