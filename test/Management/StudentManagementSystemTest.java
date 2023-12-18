package Management;

import static org.junit.Assert.*;
import org.junit.Test;

public class StudentManagementSystemTest {

    @Test
    public void testAddStudent() {
        StudentManagementSystem system = new StudentManagementSystem();

        Student student = new Student("S001", "John", 20, null);

        system.addStudent(student);

        Student retrievedStudent = system.getStudentById("S001");

        assertNotNull(retrievedStudent);

        assertEquals("John", retrievedStudent.getName());
        assertEquals(20, retrievedStudent.getAge());
    }
}
