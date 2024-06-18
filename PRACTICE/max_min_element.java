import java.util.*;

public class max_min_element {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        char[] arr= new char[n];
        char max_e=(char)(0);
        char min_e=(char)(225);
        for (int i=0 ; i<n;i++){
          arr[i]=scan.next().charAt(0);
          if (arr[i]>max_e){
            max_e=arr[i];
          }
          if (arr[i]<min_e){
            min_e=arr[i];
          }
        }

        System.out.println("max: "+max_e+"\nmin: "+min_e);

        Arrays.sort(arr);
        System.out.println("Sorted Array: "+Arrays.toString(arr));
        System.out.println("max: "+arr[arr.length-1]+"\nmin: "+arr[0]);
       // System.out.println("max: "+arr[-1]+"\nmin: "+arr[0]);  // error no support for -ve indexes
  }
}
