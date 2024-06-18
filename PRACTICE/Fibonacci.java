//Write a Java program to print the Fibonacci series up to a given number of terms.
import java.util.*;
public class Fibonacci {
    public static int fib(int n){
        if (n==0)
           return 0;
        if (n==1 || n==2){
            return  1;}
        else{
            return fib(n-1)+fib(n-2);
        } 
    }
    public static void fibo(int n){
         int a=0;
         int b=1;
         int res=0;
         if (n<2){
            System.out.print("0 ");
         }
         else{
            System.out.print("0 1 ");
         }
         for (int i=2;i<n;i++){
            res=a+b;
            System.out.print((res)+" ");
            a=b;
            b=res;
         }
         //fibo(b,a+b);
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= scan.nextInt();
        fibo(n);
        System.out.println("\nFibonacci series till "+n );
        for (int i=0;i<n;i++){
            System.out.print(fib(i)+" ");
        }
    }
}
