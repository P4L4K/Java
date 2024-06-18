import java.util.*;
public class natural_nums {
    public void natural_num(int a,int b){
        System.out.println("Natural numbers from "+a+" to "+b);
        for (int i=a;i<=b;i++)
        {
            System.out.println(i);
        }
    }
    public void even_natural_num(int a,int b){
        System.out.println("Even natural numbers from "+a+" to "+b);
        if ((a%2!=0)){ // odd
           a++;
        }   
        for (int i=a;i<=b;i+=2)
        {
            System.out.println(i);
        }
    }
    public void sum_even_odd_num(int a,int b){
        int e=0;
        int od=0;   
        for (int i=a;i<=b;i+=1)
        {
            if(i%2==0)
                e+=i;
            else
                od+=i;
        }
        System.out.println("Sum of even: "+e +"\nSumof odd: "+od);
    }
    public void even_sq_odd_cube(int a,int b){
        System.out.println("Square of Even and Cube of odd numbers from "+a+" to "+b);
        for (int i=a;i<=b;i+=1)
        {
            if(i%2==0)
                System.out.println(i*i);
            else
                System.out.println(i*i*i);
        }
       
    }
    //to print the sequence 5 10 15 20 25 using do while
    public void sequence(int a){
        System.out.println("printing 5 multiples of "+a":");
        int i=1;
        do{
           System.out.print(a*i+"\t");
           i+=1;
        }while(i<=5);
    }
    public void table(int a,int r){
        System.out.println("Table of "+a);
        int i=1;
        while (i<=r)
        {
            System.out.println(a+" x "+i+" = "+a*i);
            i++;
        }
    }
    
    public static void main(String[] args)
    {
        
        natural_nums ob= new natural_nums();
       
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter start: ");
        int a= scan.nextInt();
        System.out.print("Enter end: ");
        int b= scan.nextInt();
        scan.close();
        
        ob.natural_num(a,b);
        ob.even_natural_num(a,b);
        ob.sum_even_odd_num(a,b);
        ob.even_sq_odd_cube(a,b);
        ob.table(a,b); 
        ob.sequence(a);
       
        
    }
}
