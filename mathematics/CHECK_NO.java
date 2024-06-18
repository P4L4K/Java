// program to accept a no from user and check the no is a multiple of 5

import java.util.*;

public class CHECK_NO {

    public void check_multiple_of_5()
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your no: ");
        int n = scan.nextInt();
        scan.close();
        if (n%5==0)
             System.out.println(n+" is a multilple of 5");
        else
             System.out.println(n+" is not a multiple of 5");

    }
    public void even_odd_positive_negative()
    {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your no: ");
        int n = scan.nextInt();
        if (n>0)
        {
            if (n%2==0)
            {
                System.out.println(n+" is a positive even no.");
            }
            else
            {
                System.out.println(n+" is a positive odd no.");
            }
        }
        else
        {
            if (n%2==0)
                System.out.println(n+" is a negative even no.");
            else
                System.out.println(n+" is a negative odd no.");
        }
    }

    public static void main(String[] args)
    {
        
        CHECK_NO ob = new CHECK_NO();
        ob.even_odd_positive_negative();
    }
    
}
