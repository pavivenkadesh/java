import java.util.Scanner;
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        int b;
        Scanner s = new Scanner(System.in);
       
        b = s.nextInt();
        if(b> 0)
        {
            System.out.println("The given number "+b+" is Positive");
        }
        else if(b < 0)
        {
            System.out.println("The given number "+b+" is Negative");
        }
        else
        {
            System.out.println("The given number is zero ");
        }
    }
}
