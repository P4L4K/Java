public class HCF_LCM {
    static int gcd(int a,int b){
        if (b==0)
        {
            return a;
        }
        else
        {
            return gcd(b,a%b);
        }
    }
    static int lcm(int a,int b){
        return ((a*b)/gcd(a,b));
    }
    public static void main(String[] args){

        int a=25,b=15;
        System.out.println("hcf: "+ gcd(a,b));
        System.out.println("lcm: "+lcm(a,b));
        /*
        while(b!=0){
            int c=a;
            a=b;
            b=c%b;
        }
        System.out.println("result: "+a);
         
        while(a!=b)
        {
            if (a>b){
                a=a-b;
            }
            else{
                b=b-a;
            }
        }
        System.out.println("Hcf"+); */
        
    }
}
