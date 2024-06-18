import java.util.Scanner;

public class positive_sum_cal {
    //to accept 2 nums from users and caclulate sum until user enters +ve no.s , when a -ve no is entered exit, if the total sum at the is greater than 1000 make the sum 0.
    public void sum_positive(){
        Scanner scan= new Scanner(System.in);
        int sum=0;

        while (true){
           
            System.out.print("Enter Num: ");
            int b= scan.nextInt();
            if (b<0)
                break;
            sum+=b;
            if(sum>1000)
                sum=0;
    
        }
        scan.close();
        System.out.print("Result: "+sum);
    }
    public static void main(String[] args){
        positive_sum_cal ob= new positive_sum_cal();
        ob.sum_positive();
    }
}

