import java.util.Scanner;
class course{
    void msg(){
        System.out.println("We offer fantastic courses");
    }
}
class UG extends course{
    void UGcourses(){
        System.out.println("We offer UG courses in Civil, CS, IT,AI");
    }
}
class PG extends UG{
    void PGcourses(){
        System.out.println("We offer PG courses in Mtech, CS, IT, AI");
    }
}
class university extends course{
    void wlcm(){
        System.out.println("Welcome to University!");
    }
}
public class inheritence {
    public static void main(String[] args){
        PG ob= new PG();
        //MULTILEVEL INHERITENCE
        ob.msg();
        ob.UGcourses();
        ob.PGcourses();
        //HIERARCHICAL INHERITENCE
        UG ugob =new UG();
        university uniob =new university();
        ugob.msg();
        uniob.msg();


    }
}
