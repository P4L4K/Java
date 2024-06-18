import java.util.*;
import java.lang.*;
public class leap_year {
    boolean leap_year_check(Scanner scan){
        int year= scan.nextInt();
        if (year%4==0){
            if (year%100==0)
            {
                if (year % 400==0)
                    return true;
                else
                    return false;
            }
            return true;  
        }
        return false;
    }
    public static void main(String[] args){
         leap_year ob = new leap_year();
         Scanner scan = new Scanner(System.in);
         if (ob.leap_year_check(scan))
               System.out.println("Leap year");
         else
               System.out.println("Not leap year");
         scan.close();
    }
}
