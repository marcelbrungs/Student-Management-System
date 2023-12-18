package Management;

import java.util.List;  // needed to add because of some debugging issues when debugging/testing for errors.

public class Main {
    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();

        // can create courses below 
        Course course1 = new Course("C001", "Java Programming");
        Course course2 = new Course("C002", "Database Management");
        
        system.addCourse(course1);         // adding them to system
        system.addCourse(course2);

        // student list
        Student student = new Student("S001", "John", 20, List.of(course1, course2));
        system.addStudent(student);  // need to add them to system

        system.displayAllStudents();
        system.displayAllCourses();
    }
}
