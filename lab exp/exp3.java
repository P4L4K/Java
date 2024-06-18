
public class exp3 {

    public static void main(String[] args) {

        // Creating a new student

        Student student1 = new Student("Siya", 19, "S002");
        


        // Printing initial student details

        System.out.println("Initial Student Details:");

        System.out.println("Student Name: " + student1.getName());

        System.out.println("Student Age: " + student1.getAge());

        System.out.println("Student ID: " + student1.getStudentId());



        // Updating student details

        student1.updateDetails("Gita", 20, "S001");



        // Printing updated student details

        System.out.println("\nUpdated Student Details:");

        System.out.println("Student Name: " + student1.getName());

        System.out.println("Student Age: " + student1.getAge());

        System.out.println("Student ID: " + student1.getStudentId());



        // Deleting student details

        student1.deleteDetails();



        // Printing deleted student details

        System.out.println("\nDeleted Student Details:");

        System.out.println("Student Name: " + student1.getName());

        System.out.println("Student Age: " + student1.getAge());

        System.out.println("Student ID: " + student1.getStudentId());

    }

}
