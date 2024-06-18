/*
take user choice: 
     1 welcome
     2 hello
     3 bye
     invalid choice
 */
import java.util.*;
public class user_choice{
       public void choice()
       {
             Scanner scan= new Scanner(System.in);
             System.out.println('Enter you choice (1,2,3): ');
             int c=scan.nextInt();
             switch(c)
             {
                case 1:
                    System.out.println("Welcome");
                    break;
                case 2:
                    System.out.println("Hello");
                    break;
                case 3:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Invalid choice!");
             }
       }
       public static void main(String[] args)
       {
             user_choice ob= new user_choice();
             ob.choice();
       }
}
    

