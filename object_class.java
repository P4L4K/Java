//both inheritence and polymerphism is used
class Program{
    String name;
    int price;
    public String to_String(){
        return name+" "+price;
    }
    public String toString(){
        return name+" # "+price;
    }
}
class Program1{
    String name;
    int price;
    public String to_String(){
        return name+" "+price;
    }   
}
public class object_class {
    public static void main(String[] args) {
        Program1 obj1= new Program1();
        obj1.name="item0";
        obj1.price=200;
        System.out.println(obj1); //by default .toString() method called
        System.out.println(obj1.to_String());
        System.out.println(obj1.toString());
        Program obj= new Program();
        obj.name="item1";
        obj.price=100;
        System.out.println(obj); //by default .toString() method called
        System.out.println(obj.to_String());
        System.out.println(obj.toString()); //changed the definition of toString here 
    }
}
