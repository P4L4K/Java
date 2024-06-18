import java.util.*;
class St {
    private int studentID;  //can't be accessed outside the class
    private int student_age;
    private String student_gender;
    private String student_name;
    public St(int studentID, String name, int age, String gender){
        this.studentID=studentID;
        this.student_name=name;
        student_age=age;
        this.student_gender=gender;
    }
    public void Display(){
        System.out.println("ID: "+studentID);
        System.out.println("Name: "+student_name);
        System.out.println("Age: "+student_age);
        System.out.println("Gender: "+student_gender);
    }
    
}
class course{
    private int courseID;
    private String instructor;
    private String courseName;
    private String schedule;
    private int maxCapacity;
    private St[] student_enrolled ;
    private int curEnroll=0;
    
    public course(int cID, String inst, String cName,String schedule, int maxCapacity){
      courseID=cID;
      instructor=inst;
      courseName=cName;
      this.schedule=schedule;
      this.maxCapacity=maxCapacity;
      student_enrolled=new St[maxCapacity];
      this.curEnroll=0;

    }
    public void addStudent(St student){
        if (curEnroll<maxCapacity){
            student_enrolled[curEnroll++]=student;
        }
        else{
            System.out.println("Course is already full");
        }
    }
    public void Display(){
        System.out.println("Course ID: "+courseID);
        System.out.println("Course Name: "+courseName);
        System.out.println("Instructor: "+instructor);
        System.out.println("Schedule: "+schedule);
        System.out.println("maxCapacity: "+maxCapacity);
        System.out.println("Students Enrolled: ");
        for (St student: student_enrolled){
            if (student != null)
                student.Display();
        }
    }
    


}


public class Student_constructor{
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        St[] student =new St[4];
        System.out.println("Enter student details:");
        for (int i=0;i<1;i++){
            //input
            System.out.println("ID:"); 
            int id = scan.nextInt();
            System.out.println("NAME:");
            String name = scan.next();
            System.out.println("AGE:");
            int age = scan.nextInt();
            System.out.println("GENDER:");
            String gender = scan.next();
            student[i] =new St(id, name, age, gender);
            student[i].Display();
        }
        System.out.println("Enter course details:");
        course[] courses =new course[2];
        for (int i=0;i<2;i++){
            System.out.println("CID:");
            int cID = scan.nextInt();
            System.out.println("INSTRUCTOR:");
            String ins = scan.next();
            System.out.println("COURSE NAME:");
            String cName =scan.next();
            System.out.print("SCHEDULE: ");
            scan.nextLine();
            String schedule= scan.nextLine( );
            System.out.println("MAX CAPACITY:");
            int mcap =scan.nextInt();
            //(int cID, String inst, String cName,String schedule, int maxCapacity,St[] studenroll, int curEnroll)
            courses[i]=new course(cID,ins,cName,schedule,mcap);
            courses[i].Display();
        }
        

    }
}