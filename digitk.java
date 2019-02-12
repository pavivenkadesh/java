import java.util.*;
 class digitk
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String n=s.nextLine();
        int n1=s.nextInt();
        char b[]=n.toCharArray();
        String s1=""; 
        for(int i=0;i<n.length();i++)
        {
            if(i<n1)
            s1+="";
            else
            s1+=b[i];
        }
        System.out.print(s1);
    }
}