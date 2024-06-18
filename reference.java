//we can not directly call a method of a class by using the reference variable
class A{
    void msg(){
         System.out.println("class A");
    }
  }
  class B extends A{
    void msg(){  //changed (overridden)
         System.out.println("class B");
    }
  }
  class C extends A{
    void msg(){  //changed (overridden)
         System.out.println("class C");
    }
  }
public class reference {
    public static void main(String[] args){
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        A rf;
       // rf.msg();//ERROR
        rf= obj1;
        rf.msg();
        rf = obj2;
        rf.msg();
        rf= obj3;
        rf.msg();

    }
}
