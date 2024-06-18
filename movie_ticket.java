
/*
accept choice of movie ticket from user
 1 luxuary - 8000 rs - 10% dis
 2 premium - 500 rs - 8% dis
 3 deluxe - 300 rs - 5% dis
 take total no of tickets 
 calculate total amount , discount and payable amt
*/
import java.util.*;
public class movie_ticket {
    public void ticket_type()
    {
        Scanner scan = new Scanner(System.in);
        double amt=0, dis=0, payamt=0;
        int c=0;
        int flag=1;
        while (flag==1){
            System.out.println("""
            Menu:
            1 luxuary - 800 rs - 10% dis
            2 premium - 500 rs - 8% dis
            3 deluxe - 300 rs - 5% dis
            Enter your choice: """
            );
            c = scan.nextInt();
            System.out.println("Enter the no of tickets: ");
            int n= scan.nextInt();
            switch(c){
                case 1:
                   amt+=800*n ;
                   dis+=((10.0/100)*800)*n;
                   break;
                case 2:
                   amt+=500*n;
                   dis+=((8.0/100)*500)*n;
                   break;
                case 3:
                   amt+=300*n;
                   dis+=((5.0/100)*300)*n;
                   break;
                default:
                   System.out.println("Invalid choice");
                }
            System.out.println("\n  Do you wish to add more choice (yes(1) / no(0)): ");
            flag=scan.nextInt();
        }
        System.out.println("\nBill\n\tamt: "+amt+"\n\tdis: "+dis+"\n\tpayable amt: "+(amt-dis)+"\nThank you");
    }

    public static void main(String[] args)
    {
        movie_ticket ob= new movie_ticket();
        ob.ticket_type();
    }
    

    
}
