import java.util.Scanner;
import java.io.*;
//In Java, the if statement expects a boolean expression to determine whether to execute the corresponding block of code. 
//Unlike languages like C, C++, and Python, where any non-zero value is considered true in a boolean context, in Java, only true is considered true, and false is considered false.
//In Java, the == operator has higher precedence than the & operator.
public class even_odd {
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number:" );
        int n= scan.nextInt();
       
        if ((n & 1)== 1) //if (n&1)  or if(n&1 ==1) won't work
            System.out.println("odd" );
        else
            System.out.println("even" );

    }
}
