//Header files
import java.util.Scanner;
//Public class
public class MoveHashFront {
    // function to move hash to front 
    String moving_hash(String str){
        String results=""; //empty string to compile the results
        //iterating the given string 
        for (char i : str.toCharArray()){
            if(i=='#'){
                results = i+results; //adding '#' to front
            }
            else{
                results+=i; //adding other character in the given sequence
            }
        }
        return results; //returning the results 
    }
    //main function
    public static void main(String[] args)
    {   
        //creating scanner object
        Scanner scan = new Scanner(System.in);
        //getting the input
        System.out.print("\nEnter String: ");
        String str = scan.nextLine();
        //closing the scanner object
        scan.close();
        //creating a new MoveHashFront class ob 
        MoveHashFront ob = new MoveHashFront();
        //displaying the results
        System.out.println("Results: " + ob.moving_hash(str)+"\n");
    }
}
