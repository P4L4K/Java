
import java.util.*;

public class prime_no {
     
    static boolean prime(int n){
        for (int i=2;i<=Math.pow(n,0.5);i++){
             if (n%i==0){
                return false;
             }  
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no: ");
        if(prime(scan.nextInt()))
               System.out.println("The given no is prime");
        else
               System.out.println("The given no is not prime");
    }
}

