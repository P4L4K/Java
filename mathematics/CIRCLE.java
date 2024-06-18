
import java.util.*;
import java.lang.*;

public class CIRCLE {
    double accept(){
        Scanner ob= new Scanner(System.in);
        System.out.println("Enter R:" );
        double radius=ob.nextDouble();
        return radius;
    }
    void area(){
        double radius=accept();
        double ar=(22/7.0)*radius*radius;
        System.out.println("Area of circle: "+ar);
    }

    public static void main( String args[]){
        CIRCLE ob = new CIRCLE();
        ob.area();
    }
}
