import mathematics.*;
public class errorhandling {
    public static void main(String[] args){
        calculator ob= new calculator();
        try{
            System.out.println(ob.add(4,5)); 

        }
        catch(ArithmeticException e){
            System.out.println("congrats! error"); 

        }
    }
    
}
//eclipse or springboot
//jdk