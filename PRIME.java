import java.util.Scanner;

public class PRIME
{
    public static void main(String[] args) {
        System.out.println("Prime no.s till 40");
        int count=0;
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        if (n>=2)
        {
           System.out.println(2);
           count++;
        }
        int i=1;
        while(count<n)
         {
            int flag=1;
            for (int j=3;j<i;j++)
            {
                if (i%j==0)
                {
                    flag=0;
                    break;
                }
            }
            if (flag==1){
                 count++;
                 System.out.println(i);}
                 
            i+=2;
         }
    }
}