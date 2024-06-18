//program to accept a char an to check if the char is vowel or consonant

import java.util.*;
public class vowel_consonant {
    public void check_char()
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your character: "); 
        char c= scan.next().charAt(0);
        scan.close();
        String vowel="aeiouAEIOU";
        int flag=0;
        for (int i=0;i<10;i++)
        {
             if (vowel.charAt(i)==c)
             {
                System.out.println("VOWEL");
                flag=1;
                break;
             }
        }
        if (flag==0)
            System.out.println("Consonant");
            
    }
    public static void main(String[] args)
    {
        vowel_consonant ob= new vowel_consonant();
        ob.check_char();
    }
}
