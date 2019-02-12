package sum_of_two_elements_in_an_array;

import java.util.Scanner;

 class Sumarray {

	public static void main(String[] args) {
		int N,K,i,j,flag=0;
		Scanner sc=new Scanner(System.in);
	
		N=sc.nextInt();
		K=sc.nextInt();
		int[] array=new int[N];
	
		for(i=0;i<N;i++)
		{
			array[i]=sc.nextInt();
		}
		for(i=0;i<N;i++)
		{
			for(j=i+1;j<N;j++)
			{
				if(array[i]+array[j]==K)
				{
					flag=1;
				}
			}
		}
		if(flag==1)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}

	}

}