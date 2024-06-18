public class exp5 {
    static void print_detials(Course courseA)
    {

        System.out.println("Course Name: " + courseA.getCourseName()+ "\nCourse ID: " + courseA.getCourseId() + "\nMax Capacity: " + courseA.getMaxCapacity());
    }
    public static void main(String[] args) {

        // Adding details of a course using a parameterized constructor

        Course course1 = new Course("Java Programming", 201, 60);



        // Printing initial course details

        System.out.println("Initial Course Details:");
        print_detials(course1);


        // Updating course details

        course1.updateDetails("Advanced Java Programming", 25);



        // Printing updated course details

        System.out.println("\nUpdated Course Details:");
        print_detials(course1);

        

    }
}
