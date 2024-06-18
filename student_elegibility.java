/*
 *  find wether the student is eligible for the govt scheme
 *       given : name , age , marks
 *      eleigibility creteria:
 *            17<=age<=21
 *            marks<=80%
 */
import java.util.*;
public class student_elegibility {
    
    public void elegibility()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter name: ");
        String name= scan.nextLine();
        System.out.println("Enter age: ");
        int age= scan.nextInt();
        System.out.println("Enter marks%: ");
        double marks= scan.nextDouble();
        if (17<=age && age<=21)
        {
            if (marks>=80.0)
            {
                System.out.println(name+" is ELIGIBLE");
            }
            else
            {
                System.out.println(name+" is NON ELIGIBLE");
            }
        }
        else
            {
                System.out.println(name+" is NON ELIGIBLE");
            }
    }
    public static void main(String[] args)
    {
           student_elegibility ob= new student_elegibility();
           ob.elegibility();
    }
}
