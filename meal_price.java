/*
 given meal price (case cost of meal), tip percentage (percentage from meal cost being added as tip), tax in percent(percent from meal cost being aded as tax) for a meal. 
 print the meals total cost, round the result of the nearest integer.
 */
import java.util.*;
public class meal_price {
    public static void main(String[] args)
    {
        double mp,  tip, tax;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter meal cost: ");
        mp= scan.nextDouble();
        System.out.println("Enter tip%: ");
        tip= scan.nextDouble();
        System.out.println("Enter tax%: ");
        tax= scan.nextDouble();
        int total=(int)( mp +( tip /100.0)*mp +(tax/100.0)*mp);
        //double total =Math.round( mp +( tip /100.0)*mp +(tax/100.0)*mp);
        System.out.println( "Total amt: "+total);
    }
}
