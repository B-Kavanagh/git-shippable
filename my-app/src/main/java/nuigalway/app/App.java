package nuigalway.app;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        
        Module module1 = new Module();
        Module module2 = new Module();

        Course course = new Course();
        
        module1.add(student1);
        module1.add(student2);
        
        module2.add(student2);
        module2.add(student3);
        
        course.add(module1);
        course.add(module2);
        
        student1.getUsername();
        
        module1.getStudents();
        
        
    }
}
