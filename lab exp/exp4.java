import java.util.*;


public class exp4 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        // Creating some students

        Student student1 = new Student("Sita", 19, "S002");

        Student student2 = new Student("Gita", 20, "S001");

        Student student3 = new Student("Anand", 21, "S003");



        // Searching for a student by roll number
        System.out.println("Enter Student ID to search:");
        String searchRollNo = scan.next();

        Student searchedStudent = Student.searchByRollNo(searchRollNo);

        if (searchedStudent != null) {

            System.out.println("\nStudent found:");

            System.out.println("Name: " + searchedStudent.getName());

            System.out.println("Age: " + searchedStudent.getAge());

            System.out.println("Roll No: " + searchedStudent.getStudentId());

        } else {

            System.out.println("Student with roll number " + searchRollNo + " not found.");

        }



        // Getting results of students by roll number
        System.out.println("\nEnter Student ID to get details:");
        String rollNoToGetResults = scan.next();

        List<Student> results = Student.getResultsByRollNo(rollNoToGetResults);

        if (!results.isEmpty()) {

            System.out.println("\nResults for students with roll number " + rollNoToGetResults + ":");

            for (Student result : results) {

                System.out.println("Name: " + result.getName());

                System.out.println("Age: " + result.getAge());

                System.out.println("Roll No: " + result.getStudentId());

                System.out.println("------------------------");

            }

        } else {

            System.out.println("No students found with roll number " + rollNoToGetResults);

        }

    }
}
