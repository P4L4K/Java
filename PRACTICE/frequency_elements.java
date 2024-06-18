import java.util.*;

public class frequency_elements {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int[] arr= new int[n];
        int max=0;
        //input
        for (int i=0 ; i<n;i++){
            arr[i]=scan.nextInt();
            if (arr[i]>max){
                max=arr[i];
            }
        }
        //counting the occurences
        int [] newarr= new int[max+1];  //more space complexity
       /*  for (int i: arr){
            newarr[i]++;
        }*/
        for (int i=0;i<arr.length;i++)
        {
            newarr[arr[i]]++;
        }
        //printing
        max=arr[0];
        int max_f=newarr[arr[0]];
        for (int i: arr)
        {   
            if (newarr[i]>0){
                System.out.println(i+":"+newarr[i]);
                if(newarr[i]>max_f){
                       max=i;
                       max_f=newarr[i];
                }
                newarr[i]=0;
                
            }
        }
        System.out.println("element with max frequency: "+ max+" : "+max_f);
        /*
        Arrays.sort(arr);
        int i=0;
        System.out.println(Arrays.toString(arr));
        while(i<n)
        {   
            int c=1;
            while(i<n-1 && (arr[i]==arr[i+1])){
                i++;
                c++;
            }
            System.out.println(arr[i]+":"+c);
            i++;
        } */
    }
}
