import java.util.*;
public class capital_small_alphabet {
    void alphabet_check(char c)
    {
         if (c>='A'&& c<='Z')
             System.out.println("Upper case");
         else if (c>='a'&& c<='z')
             System.out.println("Lower case");
    }
    public static void main(String[] args){
        capital_small_alphabet ob = new capital_small_alphabet();
        Scanner scan = new Scanner(System.in);
        char c=scan.next().charAt(0);
        ob.alphabet_check(c);
        System.out.println("changed case: "+ (char) (c^('a'-'A')));
    }
}
