import java.io.*;
import java.util.*;
class Sample
{
public static void main(String args[])
{
int a;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
if(a%2==0)
System.out.println("Even");
else if(a%2==1)
System.out.println("Odd");
  else
    System.out.println("Invalid");
}
}
