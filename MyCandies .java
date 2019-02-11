
import java.util.Scanner;
 class MyCandies {
    public static void main(String args[]) {
        int tmc,mc,n,max,pos,temp,sum;
        sum=pos=0;
        boolean flag=true;
        int a[]=new int[100000];
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
            sum=sum+a[i];
        }
        for(int i=1;(i<n)&&(flag);i++){
            if(a[i]!=a[0]){
                flag=false;
            }
        }
        if(flag){
            System.out.println(sum);
        }
        if(!flag){
            max=a[0];
            for(int i=1;i<n;i++){
                if(max<a[i]){
                    max=a[i];
                    pos=i;
                }
            }
            if(pos==n-1){
                temp=a[pos-1];
            }
            else if(pos==0){
                temp=a[pos+1];
            }else{
            temp=Math.max(a[pos-1],a[pos+1]);
            }
            mc=temp+1;
            tmc=mc+sum-max;
            System.out.println(tmc);
        }
    }
}