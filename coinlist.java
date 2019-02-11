import java.util.Scanner;


  class coinlist
{

	
public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum = s.nextInt();
		int a[] = new int[n];
		int c = 0;
		for(int i = 0 ; i < n ; i++){
			a[i] = s.nextInt();
		}
		for(int i = 0 ; i < n ; i++){
			for(int j = i+1 ; j < n ; j++){
				if(a[i]< a[j]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(int k = 0; k < n ;k++){
			c = c + sum / a[k];
			sum=sum % a[k];
		}
		System.out.println(c);
	}

}