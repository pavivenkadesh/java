import java.util.Scanner;

class Alphabet1
{
    public static void main(String args[])
    {
        Scanner x = new Scanner(System.in);
        char ch = x.next().charAt(0);
		
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
        {
            System.out.print("alphabet");
        }
        else
        {
            System.out.print("no");
        }
    }
}