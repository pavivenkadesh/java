import java.io.*;
import java.util.*;
class Stringreverse
{
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
String str="";
for(int i=s.length()-1;i>=0;i--)
{
str=str+String.valueOf(s.charAt(i));
}
System.out.println(str);
}
}