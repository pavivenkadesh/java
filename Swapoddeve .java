import java.util.*;
import java.lang.*;

class Swapoddeve {

    public static void main(String aa[]) {
       String s;
       char t;
       Scanner ss=new Scanner(System.in);
       s=ss.next();
       char a[]=s.toCharArray();
       for(int i=0;i<s.length();i+=2){
           t=a[i];
           a[i]=a[i+1];
           a[i+1]=t;

       }
      for(int i=0;i<s.length();i++){
          System.out.print(a[i]);
      }

    }
}