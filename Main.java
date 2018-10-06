import java.util.Scanner;
 
class Main
{
   public static void main(String args[])
   {
      int x;
      
      Scanner in = new Scanner(System.in);
      x = in.nextInt();
     
      if (x % 2 == 0)
         System.out.println("The number is even.");
      else if(x<0) 
         System.out.println("Invalid");  
      else 
         System.out.println("The number is odd.");
   }
}