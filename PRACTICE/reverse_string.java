//Write a Java program to reverse a given string.
import java.util.*;
public class reverse_string{
    public static String RS(String str){
        String rstr="";
        for (int i=str.length()-1;i>=0;i--){
            rstr+=str.charAt(i);
        }
        return rstr;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String str= scan.nextLine();
        System.out.println("Reverse of "+str+": "+RS(str));
    }
}
