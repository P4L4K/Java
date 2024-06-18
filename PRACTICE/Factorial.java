//Write a Java program to calculate the factorial of a given number.
import java.util.*;
class Factorial{
    public static int fact(int n){
        if (n<=1){
              return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= scan.nextInt();
        System.out.println("Factorial of "+n+": "+fact(n));
    }
}