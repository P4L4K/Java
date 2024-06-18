import java.util.*;
public class methods_practice {

  // public void display();
    double pi_value(){
        return (22/7.0);
    }
    boolean pin_check(int p){
        if(p==1234)
             return true;
        else
             return false;
    }
    void results_pin_check(boolean pin_check_result){
        if (pin_check_result ){
                System.out.println("CORRECT");
        }
        else{
            System.out.println("not CORRECT");
        }
    }
    void display(){
        System.out.println("Hello");
    }
    void characters_bw(char a, char b)
    {
        System.out.println("character b/w "+a+" and "+b+": ");
        for (char i=++a;i<b;i++)
        {
            System.out.print(i+"\t");
        }
    }
    int sum(int a, int b){
        return a+b;
    }
    //write a progra to creat4e a function check() that accepts 2 numbers and  check whether a given number n is multiple of integer m
    boolean check(int n,int m)
    {
        return n%m==0;
    }
    public static void main(String [] args){
        methods_practice ob =new methods_practice();
        ob.display();
        Scanner scan= new Scanner(System.in);/* 
        ob.characters_bw(scan.next().charAt(0), scan.next().charAt(0));

        double pi_value= ob.pi_value();
        System.out.println("\nThe value of pi: "+pi_value);
        double p_value=ob.pi_value();
        System.out.println("\nThe value of pi: "+p_value);

        System.out.println("Enter the pin:");
        ob.results_pin_check(ob.pin_check(scan.nextInt()));
        */ 
      
        System.out.println("sum of 2 numbers:"+ ob.sum(4,5));
        if (ob.check(5,15)){
            System.out.println("n is multiple of m");
        }
        else{
            System.out.println("n is not a multiple of m");
        }
        Float fl = scan.nextFloat();
        System.out.println(fl/2);
    }
    
}
//wap using no return type and parameter: to accect 2 characters from user and display all characters in the range
//wap to create 2 methods 1] accept : accepts radius  2] calulate: calculate area