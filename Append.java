import java.util.*;
 class Append {
    public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
    StringBuffer s=new StringBuffer();
    String ss=in.nextLine();
    s.append(ss);
    s.append('.');
        System.out.println(s);
    }
}