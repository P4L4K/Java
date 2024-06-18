class base{
    public base(int x){
        System.out.println("given: "+x);
    }
    void cal(){
        System.out.println("Sum: "+(2+4));
    }
    void msg(){
        System.out.println("Hello");
    }
}
class derived extends base{
    public derived(int x ,int y){
        super(x);
        System.out.println("given: "+x+y);
    }
    void cal(){
        System.out.println("Sum: "+(2+4+5));
    }
}
public class dynamic_polyorphism {
    public static void main(String[] args){
        base ob1= new base(4);
        ob1.cal();
        derived ob = new derived(5,6);
        ob.msg();
        ob.cal();
    }
}
