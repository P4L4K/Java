import java.util.*; 

class student{
    String name;
    int roll;
    student(String name,int roll){
        this.name=name;
        this.roll=roll;
    }
    void dis(){
        System.out.println(name+" "+roll);
    } 
}
class course{
    String course_name;
    int seats;
    student[] stu;
    course(String cn,int s, student[] st){
        course_name=cn;
        seats= s;
        stu=st;
    }
    void dis(){
        System.out.println(course_name+" "+seats+" "+stu[0].name+" "+stu[1].roll);
    }
}


class A{
    int a;
    String b;
    float c;
    double d;
    Boolean e;
    A(){ //default constructorjjkkkk
        a=1;
        b="str";
        c=22/7;
        d=22/7.0;
        e=true;
    }
    void show(){
     System.out.println(a+" "+b+ " " +c+" "+d+" "+e);
    }
}

class test1 {
    static String x; //default null
    public void x(String[] args) {
        student obj= new student("rohan",2);
        student obj3= new student("mohan",1);
        student[] st={obj,obj3};
        course obj1=new course("java",60,st);
        obj1.dis();
        /*  String str="hello";
        String str1="hello";
        String str2= new String ("hello");
       
        System.out.println(str==str1);//true
        System.out.println(str==str2);//false
        System.out.println(str2.equals(str));//true

        str.concat( "world");
        System.out.println(str); //no change
        str=str.concat(" world");//reference is changed
        System.out.println(str); */
    }
}

public class test {
    public static void main(String[] args) { Scanner sc=new Scanner(System.in); System.out.print("Enter the number:"); int num=sc.nextInt();
    int flag=0;
    for(int i=2;i<num;i++){
                if(num%i==0){
                    flag=1;
    } }
    if(flag==1){
    System.out.println(num+" is not Prime");
    } else{
    System.out.println(num+" is Prime"); }
    } }