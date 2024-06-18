abstract class shape{
    String color;
    abstract area();
    void display(){
        System.out.println("This is a shape");
    }
    void area(int l){
         System.out.println("Area of the square:"+(l*l));
    }
    void area(int l,int b){
         System.out.println("Area of the rectange:"+(l*b));
    }
    void area(int a,int b,int c){
        double s=(a+b+c)/2;
        double ar=s*(s-1)*(s-b)*(s-c);
        ar= Math.pow(ar,0.5);
         System.out.println("Area of the triangle:"+ar);
    }
    
}
class circle extends shape{
    void area(double r){
        System.out.println("Area of the circle:"+(3.14*r*r));
    }
}
class rectangle extends shape{
    
}

public class shapes_main {
    public static void main(String args[]){
           shape_withcircle obj= new shape_withcircle();
           obj.area(4);
           obj.area(4.0);
           obj.area(4,3);
           obj.area(3,4,5);
    }
}
