import java.util.*;
public class array {
    //to accept integer variable k from user and display the name of month according to the value of interger entered by the user
    public static void main(String[] args)
    {
        

        int[] arr={11,2,33,4,5};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] arr2= new int[5];
        int arr1[]=new int[4];
        for (int i=0;i<arr1.length;i++){
            arr2[i]=i+1;
            arr1[i]=i;
        }
        System.out.println("array1: "+ Arrays.toString(arr1));
        System.out.println("array2: "+ Arrays.toString(arr2));
        int[][] ar2= new int[4][2];
        int ar1[][]=new int[4][2];
        for (int i=0;i<4;i++){
            for (int j =0; j<2;j++){
            ar2[i][j]=i+1;
            
            ar1[i][j]=i;}
        }
        System.out.println("2d array1: ");
        for (int[] row : ar1) {
            System.out.println(Arrays.toString(row));
        }
        
        System.out.println("2d array2: ");
        for (int[] row : ar2) {
            System.out.println(Arrays.toString(row));
        }

    /* 
        String[] months={"jan","feb","march","april","may","june","july","august","sept","oct","nov","dec"};
        Scanner scan = new Scanner(System.in);
        int k= scan.nextInt();
        System.out.println("result:"+months[k-1]);

        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            arr2[i]=scan.nextInt();
        }
        System.out.println("array2: "+Arrays.toString(arr2));

        String[] arr3 = new String[5];
        Arrays.fill(arr3,"hi");
        System.out.println("array3: "+Arrays.toString(arr3));

        String[] arr4= Arrays.copyOf(months,5);
        System.out.println("array4: "+Arrays.toString(arr4));

        String[] arr5 = Arrays.copyOfRange(months,5,10); //10 is not included
        System.out.println("array5: "+ Arrays.toString(arr5));
    */

    }
}
