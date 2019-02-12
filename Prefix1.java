import java.util.*;
 class Prefix1
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int min=999999;
		int i,j,len,f=1;
		int c=0;

		String st=s.nextLine();
		String A[]=new String[n];
		for(i=0;i<n;i++){
			A[i]=s.nextLine();
			len=A[i].length();
			if(len<min)
				min=len;
		}
		for(i=0;i<=min-1;i++){
			for(j=0;j<=n-2;j++){
				if(A[j].charAt(i)==A[j+1].charAt(i))
					continue;
				else{
					f=0;
					break;
				}
					
			}
			if(f==1){
				c++;
				System.out.print(A[0].charAt(i));
			}
			else
				break;

		}
		if(c==0)
			System.out.println("No prefix");
	}
	
}