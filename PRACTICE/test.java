import java.util.*;
class Shape{
    String color;
    public void msg(){
        System.out.println("displays color"+color);
    }
}
class triangle extends Shape{
    public void area(int l, int h)
    {
        System.out.println("displays: "+color);
        System.out.println(1/2.0*l*h);
    }
}
class Equilateraltriangle extends triangle{
    public void area(int l, int h)
    {
        System.out.println(l*h);
    }
}
public class test{
    public static void main(String[] args)
    {
        int[] arr={};
        System.out.println(Arrays.toString(arr));
        triangle ob = new triangle();
        ob.color="blue";
        ob.area(4,2);
        ob.msg();
       /* 
        Scanner scan = new Scanner(System.in);
        String st="hello";
        if (st.equals(st))
            System.out.println("success!");
        int arr[]={4,6,7,5};
        System.out.println(Math.max(8,9)+Arrays.toString(arr));
        int arr1[] = new int[5];
        System.out.println(Arrays.toString(arr1));
        char arr2[] = new char[5];
        System.out.println(Arrays.toString(arr1));
        float a;
        a= (float)scan.nextFloat();
        DecimalFormat ob= new DecimalFormat("#.##");
        System.out.println("float :" + ob.format(a)+"\t"+Math.floor(a)+"\t"+Math.ceil(a));
        */
    }
}