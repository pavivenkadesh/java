import java.util.Scanner;
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        int s;
        Scanner s = new Scanner(System.in);
       
        s = s.nextInt();
        if(s> 0)
        {
            System.out.println("The given number "+s+" is Positive");
        }
        else if(s < 0)
        {
            System.out.println("The given number "+s+" is Negative");
        }
        else
        {
            System.out.println("The given number is zero ");
        }
    }
}
