import java.util.*;
public class sum_even{
    public static void main(String[] args){
          Scanner scan = new Scanner(System.in);
          int n= scan.nextInt();
          int sum=0;
          int[] arr= new int[n];
          for (int i=0 ; i<n;i++){
            arr[i]=scan.nextInt();
            if (arr[i]%2==0){
                sum+=arr[i];
            }
          }

          System.out.println("sum of even nos: "+sum);
    }
}