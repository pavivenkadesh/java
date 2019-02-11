import java.util.Scanner;

 class ARArray1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x,c = 0;
		int n = s.nextInt();
		int a[] = new int[n];
		int b[] = new int[n];
		for ( int i = 0 ; i < n ; i++){
			a[i] = s.nextInt();
		}
		for(int i = 0 ; i <n ; i++){
			int num = a[i];
			c= 0;
			while(num > 0 ){
				x = num%2;
				if(x == 1)
					c++;
				num = num / 2;
			}
			b[i] = c;
		}
		for( int i = 0 ; i < n ;i++){
			for(int j = i+1 ; j < n;j++ ){
				if(b[i] == b[j]){
					if(a[i]<a[j]){
						int temp1 = b[i];
						b[i] = b[j];
						b[j] = temp1;
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
				}
				else if(b[i]<b[j]){
					int temp1 = b[i];
					b[i] = b[j];
					b[j] = temp1;
					int temp2 = a[i];
					a[i] = a[j];
					a[j] = temp2;
				}
			}
		}
		for ( int i = 0 ; i < n ; i++){
			System.out.println(a[i]);
		}
	}

}