import java.util.*;
// Student class with appropriate access specifiers

class Student {

    // Private data members to encapsulate student details

    private String name;

    private int age;

    private String studentId;

    private static List<Student> studentDatabase = new ArrayList<>();

    // Parameterized constructor to initialize student details

    public Student(String name, int age, String studentId) {

        this.name = name;

        this.age = age;

        this.studentId = studentId;

        studentDatabase.add(this); // Add student to the database upon creation

    }



    // Getter methods to access private data members

    public String getName() {

        return name;

    }



    public int getAge() {

        return age;

    }



    public String getStudentId() {

        return studentId;

    }

     // Method to update student details

     public void updateDetails(String name, int age, String studentId) {

        this.name = name;

        this.age = age;

        this.studentId = studentId;

    }



    // Method to delete student details

    public void deleteDetails() {

        this.name = null;

        this.age = 0;

        this.studentId = null;

    }

     // Method to search student details by roll number

     public static Student searchByRollNo(String rollNo) {

        for (Student student : studentDatabase) {

            if (student.getStudentId().equals(rollNo)) {

                return student; // Return the student object if found

            }

        }

        return null; // Return null if student not found

    }



    // Method to get results of students by roll number

    public static List<Student> getResultsByRollNo(String rollNo) {

        List<Student> results = new ArrayList<>();

        for (Student student : studentDatabase) {

            if (student.getStudentId().equals(rollNo)) {

                results.add(student); // Add student to results list if roll number matches

            }

        }

        return results;

    }

}



// Course class with appropriate access specifiers

class Course {

    // Private data members to encapsulate course details

    private String courseName;

    private int courseId;

    private int maxCapacity;

    private static List<Course> courseDatabase = new ArrayList<>();

    // Public constructor to initialize course details

    public Course(String courseName, int courseId, int maxCapacity) {

        this.courseName = courseName;

        this.courseId = courseId;

        this.maxCapacity = maxCapacity;

        courseDatabase.add(this); // Add course to the database upon creation

    }



    // Getter methods to access private data members

    public String getCourseName() {

        return courseName;

    }



    public int getCourseId() {

        return courseId;

    }



    public int getMaxCapacity() {

        return maxCapacity;

    }
       // Method to update course details

    public void updateDetails(String courseName, int maxCapacity) {

        this.courseName = courseName;

        this.maxCapacity = maxCapacity;

    }
    // Method to delete course details

    public void deleteDetails() {

        courseDatabase.remove(this); // Remove course from the database

    }



    // Method to get details of a course by course ID

    public static Course getCourseDetailsById(int courseId) {

        for (Course course : courseDatabase) {

            if (course.getCourseId() == courseId) {

                return course; // Return the course object if found

            }

        }

        return null; // Return null if course not found

    }

}



public class exp2 {

    public static void main(String[] args) {
        //creating a scanner object
        Scanner scan = new Scanner(System.in);

        // Creating a new student using the parameterized constructor
        System.out.println("Enter Student Name: " );
        String name=scan.nextLine();
        System.out.println("Enter Student Age: ");
        int age=scan.nextInt();
        scan.nextLine();
        System.out.println("Enter Student ID: ");
        String id= scan.nextLine();

        Student student1 = new Student(name, age,id);

        // Creating a new course using the parameterized constructor
        System.out.println("Enter Course Name: " );
        String cname=scan.nextLine();
        System.out.println("Enter Course ID: " );
        int cid=scan.nextInt();
        System.out.println("Enter Max Capacity: " );
        int cm=scan.nextInt();
        Course course1 = new Course(cname,cid, cm);

        System.out.println("\nPrinting details:");
        // Printing student details

        System.out.println("\nStudent Name: " + student1.getName());

        System.out.println("Student Age: " + student1.getAge());

        System.out.println("Student ID: " + student1.getStudentId());

        // Printing course details

        System.out.println("\nCourse Name: " + course1.getCourseName());

        System.out.println("Course ID: " + course1.getCourseId());

        System.out.println("Max Capacity: " + course1.getMaxCapacity());

    }

}

