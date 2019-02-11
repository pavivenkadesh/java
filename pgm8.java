import java.util.Scanner;
   class pgm8 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;
		int n = s.nextInt();
		int q = s.nextInt();
		int a[] = new int[n+1];
		int u[] = new int[q+1];
		int v[] = new int[q+1];
		for ( int i = 1 ; i <= n ; i++){
			a[i] = s.nextInt();
		}
		for(int i = 1 ; i <= q ; i++){
			u[i] = s.nextInt();
			v[i] = s.nextInt();
		}
		
		for ( int i = 1 ; i <= q ; i++){
			int min = 9999999;
			for( int j = u[i]; j<=v[i] ; j++){
				if(a[j]<min)
					min = a[j];
			}
			System.out.println(min);
		}
	}
 }