abstract class A{
    abstract void msg1(); //abstract method declaration
    void msg2()//concreate method
    {
       System.out.println("hello class A");
    }
}
class B extends A{
    void msg1(){
        System.out.println("hello class A ABSTRACT");
    }
    void msg()
    {
        System.out.println("hello class B");
    }
}

public class Abstract1 {
    public static void main(String[] args){
        B obj = new B();
       // A obj1 = new A(); //error
        obj.msg();
        obj.msg2();
        obj.msg1();
        
    }
}
