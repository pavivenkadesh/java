import java.util.*;
import java.math.*;
 class elementmax{
    public static void main(String aa1[]){
        int l,k=0;
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       ArrayList<Integer>aa=new ArrayList<Integer>();
       int a[][]=new int[n][n];
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
           a[i][j]=s.nextInt();
       }
       
       }
       for(int i=0;i<n;i++){
           for(int j=0;j<n;j++){
          int y= a[i][j];
          aa.add(y);
       }
       int g=Collections.max(aa);
       k=k+g;
       aa.clear();
       }
      System.out.println(k); 
    }
}