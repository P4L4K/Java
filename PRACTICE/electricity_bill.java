/*
 wap to calculate electricity bill:
      1-100  rs 1.5/ unit
      100-200 rs 2/unit
      >200    rs 2.5/unit
 */
import java.util.*;
public class electricity_bill {
    
    public void bill_cal()
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the total units: ");
        double n= scan.nextDouble();
        int amt=0;
        if (n>200)
        {
                amt+=2.5*(n-200);
                n=200;
                System.out.println(amt+" "+n);
        }
        if(n>100)
        {
            amt+=2*(n-100);
            n=100;
            System.out.println(amt+" "+n);
        }
        if (n>=1)
        {
            amt+=1.5*(n);
            System.out.println(amt+" "+n);
        }
        System.out.println("amt: "+amt);
    }
    public static void main(String[] args)
    {
        electricity_bill ob= new electricity_bill();
        ob.bill_cal();
    }
}
