import java.util.*;
import java.math.*;
class matrix{
    public static void main(String aa[]){
        int l,k;
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();
       int m=s.nextInt();
       int a[][]=new int[n][m];
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               a[i][j]=s.nextInt();
           }
       }
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               if(a[i][j]==0){
                   for( k=0;k<m;k++){
                       a[i][k]=0;
                   }
                   for(l=0;l<n;l++){
                       a[l][j]=0;
                   }
               }
           }
       }
       for(int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               System.out.println(a[i][j]);
           }
           
       }
    }
}
