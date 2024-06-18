import java.util.*;

public class patterns {
     public void p1(int n){
        for (int i=1;i<=n;i++)
        {
            for (int j =1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
     }
     public void p2(int n){
        for (int i=1;i<=n;i++)
        {
            for (int j =1;j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
     }
     public void p3(int n){
        for (int i=1;i<=n;i++)
        {
            for (int j =1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
     }
     public void p4(char n){
        for (char i='A';i<=n;i++)
        {
            for (char j='A';j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
     }
     public void p5(char n){
        for (char i='A';i<=n;i++)
        {
            for (char j='A';j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
     }
     public void p5(int n){
        for (int i=1;i<=n;i++)
        {
            
        }

     }
     
     public static void main(String[] args)
     {
        patterns ob = new patterns();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integer: ");
        int n= scan.nextInt();
        System.out.println("Enter char: ");
        char c= scan.next().charAt(0);
        ob.p1(n);
        ob.p2(n);
        ob.p3(n);
        ob.p4(c);
        ob.p5(c);
     }
}
