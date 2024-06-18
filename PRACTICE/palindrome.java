//Write a Java program to check if a given string is a palindrome.
import java.util.*;
public class palindrome{
    public static void pal(String Str){
        for( int i=0;i<(Str.length()/2);i++){
            if (Str.charAt(i)!=Str.charAt(Str.length()-1-i)){
                System.out.println("Not palindrome");
            }
        }
        System.out.println("palindrome");
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str= scan.nextLine();
        pal(str);
    }
}
