public class exp6 {
    static void print_detials(Course courseA)
    {

        System.out.println("Course Name: " + courseA.getCourseName());

        System.out.println("Course ID: " + courseA.getCourseId());

        System.out.println("Max Capacity: " + courseA.getMaxCapacity());
    }
    public static void main(String[] args) {
    
        // Adding details of a course using a parameterized constructor
    
        Course course1 = new Course("Java Programming", 201, 60);
    
        // Printing initial course details
        
        System.out.println("Initial Course Details:");
        print_detials(course1);
    
    
        // Deleting course details

        course1.deleteDetails();
    
        // Attempting to print deleted course details
    
        System.out.println("\nCourse Details after Deletion:");

        Course deletedCourse = Course.getCourseDetailsById(201);

        if (deletedCourse != null) {
            print_detials(deletedCourse);

        } else {

            System.out.println("Course with ID 101 not found.");

        }

    }
}
