/*
 * Pooja would like to wihdraw X rs from an ATM. the cash machine will only accept the transaction if X is a multiple of 5,
 *  and pooja's acc has enough move ( withdrawal + bank charges).
 * bank charges =  1.5 / successful withdrawal
 * given : inital balance , withdrawal amt
 * to find : pooja's acc balance after the transaction attempt
 */
import java.util.*;
public class ATM_WITHDRAWAL {
      
    public static void main(String[] args)
    {
        double ibal=0, wamt=0;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter initial Balance: ");
        ibal= scan.nextDouble();
        System.out.println("Enter withdrawal amt: ");
        wamt= scan.nextDouble();
        if (ibal >= (wamt+1.5)){
            ibal=ibal-(wamt+1.5);
            System.out.println("SUCCESS\nBalance:"+ibal);
        }
        else{
            System.out.println("FAIL\nBalance:"+ibal);
        }
    }
    
}
