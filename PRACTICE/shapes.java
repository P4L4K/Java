
/* .Write a java program to create a class called Rectangle that represents a rectangle. The class should have the following private attributes:

length: representing the length of the rectangle
width: representing the width of the rectangle
Implement the following member methods:

setData(): a method to set the length and width of the rectangle.
calculateArea(): a method to calculate and return the area of the rectangle.
calculatePerimeter(): a method to calculate and return the perimeter of the rectangle.
display(): a method to display the length, width, area, and perimeter of the rectangle.
The program should demonstrate the usage of this class by creating an object of Rectangle, setting its data, calculating its area and perimeter, and displaying the details.
*/
import java.text.*;
import java.lang.*;
import java.util.*;
abstract class shape{
    public void info(){
        System.out.println("This is a shape");
    }
    
    abstract double area();
    abstract void display();
}
class rectangle extends shape{
    private double length;
    private double width;

    public void setData(double l, double w){
      length =l;
      width  = w;
    }
    @Override
    public double area(){
        DecimalFormat df = new DecimalFormat("#.00");
        return Double.parseDouble(df.format(length*width));
    }
    public double calculatePerimeter(){
        return 2*(length+width);
    }
    public void display(){
        System.out.println("Length: "+this.length);
        System.out.println("Width: "+this.width);
        System.out.println("Rect Perimeter : "+this.calculatePerimeter());
        System.out.println("Rect Area : "+this.area());
    }
}
//Write a Java program to create a class called Circle that represents a circle. The class should have a private attribute radius. Implement member methods to set the radius, calculate and return the area of the circle, and display the radius and area.
class Circle extends shape{
    private double radius;
   
    public void setData(double r){
        this.radius =r;
    }
    @Override
    public double area(){
        return (22/7)*radius*radius;
    }
    @Override
    public void display(){
        System.out.println("Radius: "+this.radius);
    }
}
//Write a Java program to create a class called Triangle that represents a triangle. The class should have private attributes side1, side2, and side3. Implement member methods to set the triangle sides, calculate and return the area and perimeter, and display the triangle details.
class Triangle extends shape{
    private double s1;
    private double s2;
    private double s3;
    
    public void setData(double s1,double s2,double s3){
            this.s1=s1;
            this.s2=s2;
            this.s3=s3;
            if ((!this.isvalid())){
                   System.out.println("Not a valid triangle");
            }
    }
    public Boolean isvalid(){
        if ((s1+s2>s3) && (s1+s3>s2) && (s2+s3>s1) ){
             return true;
        }
        return false;
    }
    @Override
    public double area(){
        double s= (s1+s2+s3)/2;
        double x= (s*(s-s1)*(s-s2)*(s-s3));
        double ar= Math.pow(x,0.5);
        DecimalFormat df= new DecimalFormat("#.000");
        return Double.parseDouble(df.format(ar));
    }
    public void display()
    {
        System.out.println("Side 1: "+s1);
        System.out.println("Side 2: "+s2);
        System.out.println("Side 3: "+s3);
        System.out.println("Area "+this.area());
    }
}
public class shapes{
    public static void main(String args[]){
        rectangle obj= new rectangle();
        obj.setData(3.4,6.8);
        obj.display();
        Triangle obj1= new Triangle();
        obj1.setData(8, 5, 3);
        obj1.display();
    }
}
