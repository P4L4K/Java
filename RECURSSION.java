import java.util.Scanner;
class RECURSSION{
    static int fact(int n){
        if (n==1){
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
    static int fibo(int n)
    {
        if (n==0 || n==1)
        {
            return n;
        }
        else
        {
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args){
        /* wihtout static 
        RECURSSION ob =new RECURSSION(); 
        System.out.println(ob.fact(4)); */
        System.out.println(fact(4));
        for(int i=0;i<10;i++){
            System.out.print(fibo(i)+" ");
        }
        
    }
}
// static : to run the function wihtout creating an object 