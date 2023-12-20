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
        
        // Create some students
        Student student1 = new Student("S001", "John", 0, null);
        student1.addGrade(90);
        student1.addGrade(85);

        Student student2 = new Student("S002", "Jane", 0, null);
        student2.addGrade(75);
        student2.addGrade(80);

        system.addStudent(student1);
        system.addStudent(student2);
        system.displayAllGrades();
    }
}
