import java.util.*;
public class ticket{
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Menu:\n1.Classic ticket\n2.Premium ticket\n3.Luxury ticket");
        System.out.println("Enter Ticket choice: ");
        int choice = scan.nextInt();
        System.out.println("Enter number of ticket: ");
        int n= scan.nextInt(); //number of tickets
        int cost=0;
        double dis=0;
        switch(choice){
            case 1:
                cost = n*(150);
                dis = 0.1*(cost);
                break;
            case 2:
                cost = n*(200);
                dis = 0.15*(cost);
                break;
            case 3:
                cost = n*(300);
                dis = 0.2*(cost);
                break;
            default:
                System.out.println("Invalid Choice!");
        } 
        double total = cost-dis;
        System.out.println("Total amt: "+total);
        if (total >3000){
            System.out.println("You Got additional offers");
            System.out.println("Please Choose one:\n1. 10% extra discount\n2.Free meal");
            choice = scan.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Congrats! You got 10% additional discount");
                    dis=0.1*total;
                    total =total -dis;
                    System.out.println("Total amt: "+total);
                    break;
                case 2:
                    System.out.println("Congrats! You got a free meal");
                    break;
                default:
                    System.out.println("You skipped the additional Choice!");
            } 
        }
        System.out.println("Thank you");
    }
}