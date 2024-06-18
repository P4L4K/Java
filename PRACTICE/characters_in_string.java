//WAP to find the total no of alphabets in a string and reverse the string
import java.util.*;
public class characters_in_string {
    void alpha_count(String S)
    {   
        S=S.toLowerCase();
        int c=0;
        for (int i=0;i<S.length();i++)
        {
            if (S.charAt(i)>'a' && S.charAt(i)<'z')
            {
                c++;
            }
        }
        System.out.println(c);
    }
    void rev_func(String S)
    {
        StringBuilder ob = new StringBuilder(S);
        System.out.println(ob.reverse());
    }
    void rev(String S)
    {
        String s="";
        for (int i=S.length()-1;i>=0;i--){
             s+=S.charAt(i);
        }
        System.out.println(s);
    }
    public static void main(String[] args)
    {
        String a;
        characters_in_string ob = new characters_in_string();
        Scanner scan= new Scanner(System.in);
        String s= scan.nextLine();
        ob.rev(s);    
    }
}
