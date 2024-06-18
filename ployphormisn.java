import java.util.Scanner;
public class ployphormisn {
    public int check(float n,int m)
    { 
        if (n%m==0)
            return 1;
        
        return 0;
    }
    public int check(int m,float n)
    { 
        if (n%m==0)
            return 1;
        
        return 0;
    }
   
    public float check(float n)
    {
        return n*n;
    }
    public int check(int m,int n,int p)
    {
        return n+m+p;
    }
    
    public static void main(String [] args){
        ployphormisn ob =new ployphormisn();

        Scanner scan= new Scanner(System.in);
        if (ob.check(5.0,15)==1){
            System.out.println("n is multiple of m");
        }
        else{
            System.out.println("n is not a multiple of m");
        }
        
        System.out.println(ob.check(5));
        System.out.println(ob.check(4,2,5));
    }
}
