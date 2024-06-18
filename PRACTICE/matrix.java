import java.util.*;
public class matrix {
    int[][] add_values(Scanner scan,int n,int m){
        int[][] arr= new int[n][m];
        for (int i=0;i<n;i++)
        {    System.out.println("Enter row"+(i+1)+" : ");
            for(int j=0;j<m;j++){
                arr[i][j]=scan.nextInt();
            }
        }   
        return arr;
    }
    void display(int[][] arr){
        System.out.println("Display: ");
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j< arr[0].length;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
    int sum_arr(int[][] arr){
        int sum=0;
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++){
                  sum+=arr[i][j];
            }
        }
        return sum;
    }
    int[][] transpose(int[][] arr){
        int[][] trans_arr= new int[arr[0].length][arr.length];
        System.out.println("Transpose: ");
        for (int i=0;i<arr[0].length;i++)
        {
            for(int j=0;j< arr.length;j++){
                System.out.print(arr[j][i]+"\t");
                trans_arr[i][j]=arr[j][i];
            }
            System.out.println();
        }
        return trans_arr;
    }
    int min_arr(int[][] arr){
        int m=arr[0][0];
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++){
                 if(arr[i][j]<m){
                    m=arr[i][j];
                 }
            }
        }
        return m;
    }
    int max_arr(int[][] arr){
        int m=arr[0][0];
        for (int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++){
                 if(arr[i][j]>m){
                    m=arr[i][j];
                 }
            }
        }
        return m;
    }
    int[][] sort_rows(int[][] arr){
      for (int k= 0;k<arr.length;k++){
        for (int i=0;i<arr[k].length;i++)
        {
            for(int j=i+1;j<arr[k].length;j++)
            {
                if(arr[k][i]>arr[k][j]){
                    //swap
                    arr[k][i]=arr[k][i]^arr[k][j];
                    arr[k][j]=arr[k][i]^arr[k][j];
                    arr[k][i]=arr[k][i]^arr[k][j];
                }
            }
        }
      }
        return arr;
    }
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        matrix ob = new matrix();
        System.out.println("Enter no of rows: ");
        int n= scan.nextInt();
        System.out.println("Enter no of columns: ");
        int m= scan.nextInt();
        int[][] arr=ob.add_values(scan,n,m);
        ob.display(arr);
        ob.transpose(arr);
        System.out.println("Sum : "+ ob.sum_arr(arr));
        ob.display(ob.sort_rows(arr));
        System.out.println("Min : "+ ob.min_arr(arr));
        System.out.println("Max : "+ ob.max_arr(arr));
    }
    
    
}
