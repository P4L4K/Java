//Header files
import java.util.Scanner; 
//Public class
public class EmailAddressExtractor {
    // function to fetch the name from the email address
    String name_fetcher(String email){
           String name=""; // empty string to store the fetched name
           //iterating the given email 
           for (char i:email.toCharArray()){
               if (i=='@'){
                  break; //if @ is encountered break the loop
               }
               name+=i; //adding character to the name
           }
           return name+name.length(); //returning the name + the length of the name
    }
    //main function
    public static void main(String[] args){
        //creating a scanner object
        Scanner scan =new Scanner(System.in); 
        //getting input
        System.out.print("\nEnter your Email: ");
        String email=scan.nextLine();
        //closing the scanner object
        scan.close(); 
        //creating a new class object
        EmailAddressExtractor ob =new EmailAddressExtractor();
        //displaying the results
        System.out.println("\nResults: "+ob.name_fetcher(email)+"\n");
    }

}

