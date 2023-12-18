package Management;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.List;
import java.util.ArrayList;

public class StudentTest {

    @Test
    public void testDisplayInfo() {
        List<Course> courses = new ArrayList<>();
        courses.add(new Course("C001", "Java Programming"));
        Student student = new Student("S001", "John", 20, courses);

        // output for results in our console
        String expectedOutput = "Student ID: S001\nName: John\nAge: 20\nCourses Enrolled:\nCourse ID: C001\nCourse Name: Java Programming\n";
        assertEquals(expectedOutput, getConsoleOutput(() -> student.displayInfo()));
    }

    @Test
    public void testEnrollInCourse() {
        Student student = new Student("S002", "Jane", 22, new ArrayList<>());

        Course course = new Course("C002", "Database Management");
        student.enrollInCourse(course);
        
        assertTrue(student.getCourses().contains(course));
    }
    
    private String getConsoleOutput(Runnable runnable) {
        return "capturedOutput";
    }
}
